import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();


    @Test
    public void Test1() {

        customers car1 = em.find(customers.class, 103);
        System.out.println(car1);
    }


    @Test
    public void Test2() {
        products pro1 = em.find(products.class,"S10_1678");
        System.out.println(pro1);
    }

    @Test
    public void Test3(){

    orders ord1 = em.find(orders.class,10100);
        System.out.println(ord1);

    }

    @Test
    public void Test4(){

        orders ord1 = em.find(orders.class, 10109);
        System.out.println(ord1.getComments());

    }






}
