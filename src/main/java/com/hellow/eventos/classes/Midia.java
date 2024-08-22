package com.hellow.eventos.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="midia")
@Table(name="midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer midia_id;
    private String formato;
    private String duracao;
    private String tamanho;
    private String link;

}
