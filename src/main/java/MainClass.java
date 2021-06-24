import model.Dog;
import model.Human;
import model.Villain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pearlDatabase");
        EntityManager em = emf.createEntityManager();



        Human h1 = em.find(Human.class, 17);
        Dog dog = em.find(Dog.class, 19);
        System.out.println(dog.getHuman());

        //                               Select * From Dog Join Human ON dog.human_id = Human.id WHERE Human.id = 17;
        Query query = em.createQuery("Select d From Dog d JOIN d.human h WHERE h.id = 17 ");
        List<Dog> dogList = query.getResultList();

        for (Dog d: dogList)
            System.out.println(d);








       /* Human human = new Human("Tam");

        Dog dog = new Dog("Fido3",human);
        Dog dog1 =new Dog("Lassie3", human);
        Dog dog2 =new Dog("Spot3", human);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);

        human.setDogs(dogs);


        em.getTransaction().begin();
       em.remove(dog);
        em.getTransaction().commit();*/









    }
}
