import model.Person;
import model.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersonTicketMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

//        Create
//        entityManager.getTransaction().begin();
//        Ticket ticket = new Ticket("3F");
//        Person person = new Person("Jose", "jose@gmail.com", ticket);
//        entityManager.persist(person);
//        entityManager.persist(ticket);
//        entityManager.getTransaction().commit();

//        Read once
//        entityManager.getTransaction().begin();
//        Person person = entityManager.find(Person.class, 1);
//        entityManager.getTransaction().commit();
//        System.out.println(person.getId());
//        System.out.println(person.getName());
//        System.out.println(person.getEmail());
//        System.out.print(person.getTicket().getId());

//        entityManager.getTransaction().begin();
//        Ticket ticket = entityManager.find(Ticket.class, 1L);
//        entityManager.getTransaction().commit();
//        System.out.println(ticket.getId());
//        System.out.println(ticket.getCode());
//        System.out.print(ticket.getPerson().getName());

        entityManager.close();
    }
}
