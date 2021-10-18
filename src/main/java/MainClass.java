

import model.Beer;
import repository.BeerRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        BeerRepository beerRepository = new BeerRepository();

        Beer newBeer = new Beer(6000, "super pils", 6,6,6,6,6);
       // beerRepository.createBeer(newBeer);
        Beer oldBeer = beerRepository.getBeerById(7000);
      beerRepository.deleteBeer(oldBeer);

        List<Beer> beers = beerRepository.getAllBeers();

        for(Beer beer: beers) {

            System.out.println(beer);

        }





























    }
}
