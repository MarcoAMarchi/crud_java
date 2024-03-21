package br.com.soften.crud.repositories;

import br.com.soften.crud.models.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> { //Faltou o @Repository (corrigido)

    List<Products> findByProductNameContaining(String productName);
}
