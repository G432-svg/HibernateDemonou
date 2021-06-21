package model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class SideChick {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String name;
    private String franchise;
}
