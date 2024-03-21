package br.com.soften.crud.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn( name = "client_id")
    private Client client; // Não é necessário colocar a relação dos dois lados, só aqui está bom, pode tirar do Client

}
