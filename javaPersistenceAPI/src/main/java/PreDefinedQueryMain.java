import model.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class PreDefinedQueryMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

        entityManager.getTransaction().begin();
        TypedQuery<Product> pageProductsEveryTen = entityManager.createNamedQuery(
            "getAllProductsByPreCreatedQuery",
            Product.class
        );
        entityManager.getTransaction().commit();

        List<Product> products = pageProductsEveryTen.getResultList();

        for (Product product: products){
            System.out.println(product.getName());
        }

        entityManager.close();
    }
}
