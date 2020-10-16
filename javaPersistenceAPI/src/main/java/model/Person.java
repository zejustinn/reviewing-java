package model;

import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@javax.persistence.Table(name="person")
public class Person {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @javax.persistence.OneToOne
    @javax.persistence.JoinColumn(name = "id_ticket")
    private Ticket ticket;
    @javax.persistence.OneToMany(mappedBy ="person")
    private List<Phone> phone = new ArrayList<>();
    @javax.persistence.ManyToMany
    @javax.persistence.JoinTable(
        name = "person_has_job",
        joinColumns = @javax.persistence.JoinColumn(
            name = "id_person",
            referencedColumnName="id"
        ),
        inverseJoinColumns = @javax.persistence.JoinColumn(
            name="id_job",
            referencedColumnName="id"
        )
    )
    private List<Job> job = new ArrayList<>();

    public Person() {}

    public Person(int id) {
        this.id = id;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, Ticket ticket) {
        this.name = name;
        this.email = email;
        this.ticket = ticket;
    }

    public Person(String name, String email, List<Phone> phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Job> getJob() {
        return job;
    }

    public void setJob(List<Job> job) {
        this.job = job;
    }
}
