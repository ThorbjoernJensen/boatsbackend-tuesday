package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "boat")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brand;
    private String image;

    @ManyToMany
    Set<Owner> owners= new HashSet<>();

    @ManyToOne
    Harbour harbour;


    public Boat(long id, String name, String brand, String image) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.image = image;
    }

    public Boat(String name, String brand, String image) {
        this.name = name;
        this.brand = brand;
        this.image = image;
    }

    public Boat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Owner> getOwners() {
        return owners;
    }

    public void addOwner(Owner owner) {
        this.owners.add(owner);
        owner.getBoats().add(this);
    }

    public Harbour getHarbour() {
        return harbour;
    }

    public void setHarbour(Harbour harbour) {
        this.harbour = harbour;
    }
}