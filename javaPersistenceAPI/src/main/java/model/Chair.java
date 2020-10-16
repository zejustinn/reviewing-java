package model;

import javax.persistence.DiscriminatorType;
import javax.persistence.GenerationType;
import javax.persistence.InheritanceType;

@javax.persistence.Entity
@javax.persistence.Table(name = "chair")
@javax.persistence.Inheritance(strategy = InheritanceType.JOINED)
@javax.persistence.DiscriminatorColumn(
        name = "type",
        length = 2,
        discriminatorType = DiscriminatorType.STRING
)
@javax.persistence.DiscriminatorValue("NC")
public class Chair {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String color;

    public Chair() { }

    public Chair(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
