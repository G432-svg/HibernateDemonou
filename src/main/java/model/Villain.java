package model;

import javax.persistence.*;

@Entity
public class Villain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "villainName", unique = true)
    private String name;
    private String franchise;


    public Villain() {
    }

    public Villain(String name, String franchise) {
        this.name = name;
        this.franchise = franchise;
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

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", franchise='" + franchise + '\'' +
                '}';
    }
}
