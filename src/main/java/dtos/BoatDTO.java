package dtos;

import entities.Boat;
import entities.Harbour;
import entities.Owner;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BoatDTO {
    private Long id;
    private String name;
    private String brand;
    private String image;
    Set<OwnerDTO> owners = new HashSet<>();

    HarbourDTO harbour;

    public BoatDTO(Boat boat) {
        if (boat.getId() != null) {
            this.id = boat.getId();
        }
        this.name = boat.getName();
        this.brand = boat.getBrand();
        this.image = boat.getImage();
        if (boat.getOwners().size() > 0) {
            this.owners = OwnerDTO.makeDTOSet(boat.getOwners());
        }
        if (boat.getHarbour() != null) {
            this.harbour = new HarbourDTO(boat.getHarbour());
        }
    }

    public static Set<BoatDTO> makeDTOSet (List<Boat> boats){
        Set<BoatDTO> boatDTOSet = new HashSet<>();
        boats.forEach(boat -> boatDTOSet.add(new BoatDTO(boat)));
        return boatDTOSet;
    }
}
