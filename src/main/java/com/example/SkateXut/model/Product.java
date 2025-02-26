package com.example.SkateXut.model;

import lombok.*;
import javax.persistence.*;



@Getter
@Setter
@ToString
@Table(name = "product")
@Entity
public class Product {

    @Id
    @Column(unique = true)
    private int barcode;

    @NonNull
    @Column
    private String productName;

    @NonNull
    @Column (columnDefinition = "TEXT")
    private String description;

    @NonNull
    @Column
    private String colour;

    @NonNull
    @Column
    private String dimentions;

    @NonNull
    @Column
    private String materials;
    
    @Column
    private int stock;

    public Product() {
    }

    public Product(int barcode, String productName, String description, String colour, String dimentions, String materials, int stock) {
        super();
        this.barcode = barcode;
        this.productName = productName;
        this.description = description;
        this.colour = colour;
        this.dimentions = dimentions;
        this.materials = materials;
        this.stock = stock;
    }
    
}