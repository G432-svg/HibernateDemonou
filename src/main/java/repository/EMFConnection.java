package repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFConnection {

    public static EntityManagerFactory returnPearlEMF(){
        return Persistence.createEntityManagerFactory("pearlDatabase");
    }

    public static EntityManagerFactory returnMovieEMF(){
        return Persistence.createEntityManagerFactory("movieDatabase");
    }
}
