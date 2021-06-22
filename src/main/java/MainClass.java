import model.Dog;
import model.Human;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pearlDatabase");
        EntityManager em = emf.createEntityManager();








        Human human = new Human("Tim");

        Dog dog = new Dog("Fido",human);
        Dog dog1 =new Dog("Lassie", human);
        Dog dog2 =new Dog("Spot", human);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        human.setDogs(dogs);


        em.getTransaction().begin();

        em.persist(human);



        em.getTransaction().commit();

        System.out.println(human);



    }
}
