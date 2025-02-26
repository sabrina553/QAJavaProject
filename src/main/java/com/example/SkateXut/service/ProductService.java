package com.example.SkateXut.service;

import com.example.SkateXut.DTO.ProductDTO;
import com.example.SkateXut.model.Product;
import com.example.SkateXut.model.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ModelMapper mapper;
    private final ProductRepository repo;

    @Autowired
    public ProductService(ProductRepository repo, ModelMapper mapper){
        super();
        this.mapper = mapper;
        this.repo = repo;

    }

    private ProductDTO mapToDTO(Product product) {
        return this.mapper.map(product, ProductDTO.class);
    }

    //create
    public boolean addProduct(Product product) {
        try{repo.save(product);}catch (Exception e){
            throw new IllegalArgumentException();
        }
        return true;
    }

    //read
    public List<ProductDTO> getAll(){
        return this.repo.findAll()
                .stream().map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO getProductByBarcode(Integer barcode) {
        try {
            Product product = repo.findProductByBarcode(barcode);
            return mapToDTO(product);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public ProductDTO getProductByName(String name){
        try{
            Product product = repo.findProductByProductName(name);
            return mapToDTO(product);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    //update
    public boolean updateProduct(int barcode, Product updated) {
        try{
            deleteByBarcode(barcode);
            addProduct(updated);
            return repo.existsById(updated.getBarcode());
        } catch (Exception e){
            throw new IllegalArgumentException();
        }
   }

    //delete
    public Boolean deleteByBarcode(Integer barcode) {
        try {
            this.repo.existsById(barcode);
            this.repo.deleteById(barcode);
            return !this.repo.existsById(barcode);
        }catch (Exception e){
            throw new EntityNotFoundException();
        }
    }
}
