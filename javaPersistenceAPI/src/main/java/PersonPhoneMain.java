import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonPhoneMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

//        Create
//        entityManager.getTransaction().begin();
//
//        Person person = new Person("Jose", "jose@gmail.com");
//        Phone phone1 = new Phone("32421232", person);
//        Phone phone2 = new Phone("995701999", person);
//
//        entityManager.persist(phone1);
//        entityManager.persist(phone2);
//        entityManager.persist(person);
//        entityManager.getTransaction().commit();

//        Read once
//        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 1);
//        entityManager.getTransaction().commit();
//
//        for(Phone phone: person.getPhone()){
//            System.out.println(phone.getNumber());
//        }

        entityManager.close();
    }
}
