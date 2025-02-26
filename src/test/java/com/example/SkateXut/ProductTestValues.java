package com.example.SkateXut;

import com.example.SkateXut.DTO.ProductDTO;
import com.example.SkateXut.model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductTestValues {

    public static final Product toyMachineMonster = new Product
            (12345678, "Toy Machine Monster Complete Skateboard", "A Toy Machine deck has all the pop, flex, and feel without breaking the bank. A perfect present for a budding skater.",
                    "Purple", "8", "7-Ply Maple Deck", 100);
    public static final Product welcomeSloth = new Product
            (23456781, "Welcome Sloth Complete Skateboard", "The Sloth complete comes fitted with Welcome branded trucks and wheels with Abec 7 bearings so they not only look great but perform like a charm. Featuring eccentric and weirdly wonderful artwork, and original deck shapes unique to Welcome skateboards",
                    "Purple", "8", "7-Ply North American Maple", 69);
    public static final Product urbanArttxStriker = new Product
            (18273645, "UrbanArtt x Striker Custom Stunt Scooter", "Featuring a range of high quality components from UrbanArtt, Striker, District, Blazer Pro and Eagle Sport brands",
                    "Chrome/Black/Blue", "950x118", "Aluminium", 420);
    public static final Product almostPlacesR7 = new Product
            (81726354, "Almost Places R7 Skateboard Deck - Youness", "Oh the places youll go, with this R7 Pro Places Series deck from Almost.",
                    "Orange", "8", "7-Ply Canadian Maple", 808);



    public static final List<Product> almostPlacesR7List = new ArrayList<>(List.of(almostPlacesR7));
    public static final List<Product> urbanArttxStrikerlist = new ArrayList<>(List.of(urbanArttxStriker));

    public static final List<Product> allProducts = new ArrayList<>(List.of(welcomeSloth, urbanArttxStriker, almostPlacesR7));



    public static final ProductDTO toyMachineMonsterDTO = new ProductDTO(12345678, "Toy Machine Monster Complete Skateboard", "A Toy Machine deck has all the pop, flex, and feel without breaking the bank. A perfect present for a budding skater",
            "Purple", "8", "7-Ply Maple Deck", 100);

    public static final ProductDTO welcomeSlothDTO = new ProductDTO(23456781, "Welcome Sloth Complete Skateboard", "The Sloth complete comes fitted with Welcome branded trucks and wheels with Abec 7 bearings so they not only look great but perform like a charm. Featuring eccentric and weirdly wonderful artwork, and original deck shapes unique to Welcome skateboards",
            "Purple", "8", "7-Ply North American Maple", 69);

    public static final ProductDTO urbanArttxStrikerDTO = new ProductDTO(18273645, "UrbanArtt x Striker Custom Stunt Scooter", "Featuring a range of high quality components from UrbanArtt, Striker, District, Blazer Pro and Eagle Sport brands",
            "Chrome/Black/Blue", "950x118", "Aluminium", 420);

    public static final ProductDTO almostPlacesR7DTO = new ProductDTO(81726354, "Almost Places R7 Skateboard Deck - Youness", "Oh the places youll go, with this R7 Pro Places Series deck from Almost.",
            "Orange", "8", "7-Ply Canadian Maple", 808);

    public static final List<ProductDTO> allProductsDTO = new ArrayList<>(List.of(welcomeSlothDTO, urbanArttxStrikerDTO, almostPlacesR7DTO));


    public static final Product urbanArttxStrickerUnit = new Product(18273645, "UrbanArtt x Striker Custom Stunt Scooter", "Featuring a range of high quality components from UrbanArtt, Striker, District, Blazer Pro and Eagle Sport brands",
            "Chrome/Black/Blue", "950x118", "Aluminium", 420);


}


