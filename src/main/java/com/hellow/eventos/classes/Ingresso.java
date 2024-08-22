package com.hellow.eventos.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Ingresso")
@Table(name="Ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer ingresso_id;
    private Float valor_base;
    private Boolean meia;
    private Boolean social;
    private Float valor_pago;
    private Boolean pago;
    private Boolean vip;

}
