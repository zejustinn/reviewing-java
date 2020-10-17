package br.com.jlsj.sprinhibernate.springAndHibernate.model;

import javax.persistence.GenerationType;
import java.text.SimpleDateFormat;
import java.util.Date;

@javax.persistence.Entity
@javax.persistence.Table(name = "person")
public class Person {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;

    @javax.persistence.Column(nullable = false)
    private String name;

    @javax.persistence.Column(
            unique = true,
            nullable = false
    )
    private String email;

    private Date birthDate;

    public Person() {}

    public Person(long id, String name, String email, Date birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Person(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = this.dateFormatConverter(birthDate);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setUnformattedBirthDate(String birthDate) {
        this.birthDate = this.dateFormatConverter(birthDate);
    }

    private Date dateFormatConverter(String date){
        try{
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (Exception e) {}
        return null;
    }
}
