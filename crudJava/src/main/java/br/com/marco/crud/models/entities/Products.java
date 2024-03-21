package br.com.soften.crud.models.entities;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length=60, nullable=false)
    private String productName;

    @Column(scale = 4, precision = 10, nullable = false)
    private BigDecimal cost;

    @Column(scale = 4, precision = 10, nullable = false)
    private BigDecimal venda; // Tenta manter um padrão para a nomenclatura no projeto, ou todas em português, ou todas em inglês
}