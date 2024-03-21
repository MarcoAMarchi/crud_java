package br.com.soften.crud.controller;


import br.com.soften.crud.models.entities.Products;
import br.com.soften.crud.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController { //Geralmente, o padrão do nome da classe é no singular
    @Autowired
    private ProductsService productsService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        Products products = productsService.findById(id);
        return ResponseEntity.ok(products);
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Products products){
        Products save = productsService.save(products);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> remove(@PathVariable long id){
        productsService.remove((id));
        return ResponseEntity.ok("");
    }
    @GetMapping("/findName/{productName}")
    public ResponseEntity<?> findByName(@PathVariable String productName){
        List<Products> products = productsService.findByName(productName);
        return ResponseEntity.ok(products);
    }
    @GetMapping("/findall")
    public ResponseEntity<?> findall(){
        List<Products> products = productsService.findAll();
        return ResponseEntity.ok(products);
    }
}
