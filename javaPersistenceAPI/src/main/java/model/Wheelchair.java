package model;

@javax.persistence.Entity
@javax.persistence.Table(name = "wheelchair")
@javax.persistence.DiscriminatorValue("WC")
public class Wheelchair extends Chair {
    private String wheel;

    public Wheelchair(String color, String wheel) {
        super(color);
        this.wheel = wheel;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}
