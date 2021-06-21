import model.Villain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pearlDatabase");
        EntityManager em = emf.createEntityManager();

     //   Villain villain1 = new Villain("Ursula", "The Little Mermaid");

        Villain villain2 = em.find(Villain.class,2 );



        em.getTransaction().begin();
       // em.persist(villain1);
        em.remove(villain2);

        em.getTransaction().commit();

        System.out.println(villain2);


    }
}
