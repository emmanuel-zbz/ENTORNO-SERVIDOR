package org.iesbelen.model;

public class FabricanteDTO extends Fabricante{

    private Integer countProductos;


    public FabricanteDTO() {
        super();
    }

    public FabricanteDTO(int idFabricante, String nombre){
        super();
        this.setIdFabricante(idFabricante);
        this.setNombre(nombre);
    }

    public FabricanteDTO(int idFabricante, String nombre, Integer countProductos){
        super();
        this.setIdFabricante(idFabricante);
        this.setNombre(nombre);
        this.setCountProductos(countProductos);
    }

    public void setCountProductos(Integer countProductos) {
        this.countProductos = countProductos;
    }

    public Integer getCountProductos() {
        return countProductos;
    }

}
