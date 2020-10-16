package model;

import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@javax.persistence.Table(name = "job")
public class Job {
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long id;
    private String job;
    @javax.persistence.ManyToMany(mappedBy = "job")
    private List<Person> employee = new ArrayList<>();

    public Job() { }

    public Job(String job) {
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<Person> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Person> employee) {
        this.employee = employee;
    }
}
