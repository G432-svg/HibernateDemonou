package repository;

import model.Beer;

import javax.persistence.EntityManager;
import java.util.List;

public class BeerRepository {

    public Beer getBeerById(int id){
        EntityManager em = EMFConnection.returnPearlEMF().createEntityManager();
        return em.find(Beer.class, id);
    }

    public List<Beer> getAllBeers(){
        EntityManager em =  EMFConnection.returnPearlEMF().createEntityManager();
        List<Beer> beers = em.createQuery("Select b From BeersTest b").getResultList();
        return beers;
    }

    public void createBeer(Beer beer){
        EntityManager em =  EMFConnection.returnPearlEMF().createEntityManager();
        em.getTransaction().begin();
        em.persist(beer);
        em.getTransaction().commit();
    }

    public void updateBeer(Beer beer){
        EntityManager em =  EMFConnection.returnPearlEMF().createEntityManager();
        em.getTransaction().begin();
        em.merge(beer);
        em.getTransaction().commit();
    }


    public  void deleteBeer (Beer beer){
        EntityManager em =  EMFConnection.returnPearlEMF().createEntityManager();
        em.getTransaction().begin();
        Beer toRemove = em.find(Beer.class, beer.getId());
        em.remove(toRemove);
        em.getTransaction().commit();
    }
}
