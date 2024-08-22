package com.hellow.eventos.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="fornecedor")
@Table(name="fornecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer fornecedor_id;
    private String nome;
    private Integer cnpj;
    private Boolean ativo;
}
