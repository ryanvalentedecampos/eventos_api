package com.hellow.eventos.classes;

import com.hellow.eventos.classes.tipo.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
