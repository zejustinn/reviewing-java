import model.Chair;
import model.Wheelchair;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ChairMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

        entityManager.getTransaction().begin();
        Chair chair = new Chair("Branca");
        Wheelchair wheelchair = new Wheelchair("Azul", "Cromada");
        entityManager.persist(chair);
        entityManager.persist(wheelchair);
        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
