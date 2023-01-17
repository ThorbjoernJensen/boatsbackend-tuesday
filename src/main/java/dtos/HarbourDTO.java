package dtos;

import entities.Harbour;

public class HarbourDTO {
    private Long id;
    private String name;
    private String address;
    private long capacity;

    public HarbourDTO(Harbour harbour) {
        this.id = harbour.getId();
        this.name = harbour.getName();
        this.address = harbour.getAddress();
        this.capacity = harbour.getCapacity();
    }
}
