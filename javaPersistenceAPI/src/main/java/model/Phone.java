package model;

@javax.persistence.Entity
@javax.persistence.Table(name = "phone")
public class Phone {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id;
    @javax.persistence.Column(nullable = false)
    private String number;
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(name = "id_person")
    private Person person;

    public Phone() { }

    public Phone(String number) {
        this.number = number;
    }

    public Phone(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
