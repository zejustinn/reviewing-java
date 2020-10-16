package model;

import javax.persistence.GenerationType;

@javax.persistence.Entity
@javax.persistence.Table(name="ticket")
public class Ticket {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @javax.persistence.Column(unique = true)
    private String code;
    @javax.persistence.OneToOne(mappedBy = "ticket")
    private Person person;

    public Ticket() {}
    public Ticket(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
