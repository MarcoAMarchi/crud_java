package br.com.soften.crud.repositories;

import br.com.soften.crud.models.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale,long> {
    List<Sale> findAllByClient
}
