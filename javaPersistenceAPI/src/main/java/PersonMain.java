import model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
            .createEntityManagerFactory("test_database")
            .createEntityManager();

//        Create
//        entityManager.getTransaction().begin();
//        Person person = new Person("Jose", "jose@gmail.com");
//        entityManager.persist(person);
//        entityManager.getTransaction().commit();

//        Read once
//        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 1);
//        entityManager.getTransaction().commit();
//        System.out.println(person.getId());
//        System.out.println(person.getName());
//        System.out.print(person.getEmail());

//        Read All
//        entityManager.getTransaction().begin();
//        List<Person> people = entityManager
//            .createQuery(
//                "SELECT p FROM Person p",
//                Person.class
//            ).getResultList();
//
//        for(Person person: people){
//            System.out.println(person.getId());
//            System.out.println(person.getName());
//            System.out.print(person.getEmail());
//        }

//        Update
//        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 1);
//        entityManager.detach(person);
//        person.setName("Maria Seni");
//        entityManager.merge(person);
//        entityManager.getTransaction().commit();

//        Delete
//        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 1);
//        if(person != null){
//            entityManager.remove(person);
//        }
//        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
