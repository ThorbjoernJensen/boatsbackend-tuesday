package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "harbour")
public class Harbour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private long capacity;

    @OneToMany (mappedBy = "harbour")
    Set<Boat> boats = new HashSet<>();

    public Harbour(long id, String name, String address, long capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
//        this.boats = boats;
    }

    public Harbour(String name, String address, long capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public Harbour() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public Set<Boat> getBoats() {
        return boats;
    }

    public void addBoat(Boat boat) {
        this.boats.add(boat);
    }
}