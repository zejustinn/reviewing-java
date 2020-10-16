package model;

import javax.persistence.GenerationType;

@javax.persistence.Entity
@javax.persistence.Table(name = "product")
public class Product {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @javax.persistence.Column(length = 100, nullable = false)
    private String name;

    @javax.persistence.Column(precision = 11, scale = 2, nullable = false)
    private Double price;

    @javax.persistence.Column(unique = true, updatable = false, nullable = false)
    private String code;

    @javax.persistence.Transient
    private Double discount;

    @javax.persistence.Transient
    private Double fullPrice;

    @javax.persistence.Transient
    private boolean fullPriceHasChanged;

    public Product() {}

    public Product(String name, Double price, String code) {
        this.name = name;
        this.setPrice(price);
        this.setCode(code);
    }

    public Product(String name, Double price, String code, Double discount) {
        this.name = name;
        this.setPrice(price);
        this.setCode(code);
        this.setDiscount(discount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(this.discount != null)
            this.price = this.applyDiscount(price, this.discount);

        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = this.removeCodeMask(code);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        if(this.price != null){
            this.fullPriceHasChanged = true;
            this.fullPrice = this.price;
            this.price = this.applyDiscount(this.price, discount);
        }

        if(this.fullPriceHasChanged)
            this.price = this.applyDiscount(this.fullPrice, discount);

        this.discount = discount;
    }

    private String removeCodeMask(String code){
        return code.replace(".", "").replace("-", "");
    }

    private void checksDiscount(Double discount){
        if(discount < 0 || discount > 1)
            throw new RuntimeException("Invalid discount");
    }

    private double applyDiscount(Double price, Double discount){
        this.checksDiscount(discount);

        return (double) Math.round(
                (price * (1 - discount)) * 100
        ) / 100;
    }
}
