package br.com.soften.crud.services;

import br.com.soften.crud.models.entities.Products;
import br.com.soften.crud.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository; //! Não é uma boa declara um atributo com static e colocar Autowired nele, isso pode causar alguns erros com o Spring (corrigido)

    @Value("crud")
    private String productName;

    public Products save(Products products){
        if(products.getProductName() == null){
            products.setProductName(productName);
        }
        return productsRepository.save(products);
    }
    public void remove(long id) { productsRepository.deleteById(id);}

    public Products findById(long id) { return productsRepository.findById(id).orElse(new Products());}

    public List<Products> findAll() { return productsRepository.findAll();}

    public List<Products> findByName(String productName) { return productsRepository.findByProductNameContaining(productName);}
}
