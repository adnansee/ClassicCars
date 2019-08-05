import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        customers car1 = em.find(customers.class ,103);
        products pro1 = em.find(products.class,"S10_1678");
        tx.begin();
        em.persist(car1);
        tx.commit();
        System.out.println("----------------------------------");
        System.out.println(car1);
        System.out.println("----------------------------------");
        System.out.println(pro1);
        System.out.println("----------------------------------");
        emf.close();
    }
}
