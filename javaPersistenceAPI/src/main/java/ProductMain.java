import model.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence
                .createEntityManagerFactory("test_database")
                .createEntityManager();

//        Create
//        entityManager.getTransaction().begin();
//        Product product = new Product(
//            "Eraser",
//            1.20,
//            "999.888.777-66",
//            0.1
//        );
//        entityManager.persist(product);
//        entityManager.getTransaction().commit();

//        Read once
//        entityManager.getTransaction().begin();
//        Product product = entityManager.find(Product.class, 2L);
//        entityManager.getTransaction().commit();
//        System.out.println(product.getId());
//        System.out.println(product.getName());
//        System.out.println(product.getPrice());
//        System.out.print(product.getCode());

//        Read All
//        entityManager.getTransaction().begin();
//        List<Product> productList = entityManager
//            .createQuery(
//                "SELECT p FROM Product p",
//                Product.class
//            ).getResultList();
//
//        for(Product product: productList){
//            System.out.println(product.getId());
//            System.out.println(product.getName());
//            System.out.println(product.getPrice());
//            System.out.println(product.getCode() + "\n");
//        }

//        Update
//        entityManager.getTransaction().begin();
//        Product product = entityManager.find(Product.class, 2L);
//        entityManager.detach(product);
//        product.setName("Eraser");
//        product.setCode("333.888.777-66"); // updatable = false isn't send to update instruction
//        entityManager.merge(product);
//        entityManager.getTransaction().commit();

//        Delete
//        entityManager.getTransaction().begin();
//        Product product = entityManager.find(Product.class, 3L);
//        if(product != null){
//            entityManager.remove(product);
//        }
//        entityManager.getTransaction().commit();
//
        entityManager.close();
    }
}
