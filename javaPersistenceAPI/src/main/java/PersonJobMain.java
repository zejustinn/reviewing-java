import model.Job;
import model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersonJobMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

        Person person = new Person("Henrique", "henrique@gmail.com");
        Job job = new Job("Student");

        person.getJob().add(job);
        job.getEmployee().add(person);

        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.persist(job);
        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
