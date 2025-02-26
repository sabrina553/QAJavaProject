package com.example.SkateXut.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Setter
@ToString
@DynamicUpdate
public class ProductDTO {

    private int barcode;
    private String productName;
    private String description;
    private String colour;
    private String dimentions;
    private String materials;
    private int stock;

    public ProductDTO(){
        super();
    }

    public ProductDTO(int barcode, String productName, String description, String colour, String dimentions, String materials, int stock) {
        this.barcode = barcode;
        this.productName = productName;
        this.description = description;
        this.colour = colour;
        this.dimentions = dimentions;
        this.materials = materials;
        this.stock = stock;
    }
}
