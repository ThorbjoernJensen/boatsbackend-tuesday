package dtos;

import entities.Owner;

import java.util.HashSet;
import java.util.Set;

public class OwnerDTO {
    private Long id;
    private String name;
    private String address;
    private String phone;

    public OwnerDTO(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.address = owner.getAddress();
        this.phone = owner.getPhone();
    }

    public static Set<OwnerDTO> makeDTOSet (Set<Owner> owners){
        Set<OwnerDTO> ownerDTOSet = new HashSet<>();
        owners.forEach(owner -> ownerDTOSet.add(new OwnerDTO(owner)));
        return ownerDTOSet;
    }
}
