package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "human", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Dog> dogs;


    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", dogs=" + dogs +
                '}';
    }
}
