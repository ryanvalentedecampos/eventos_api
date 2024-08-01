package com.hellow.eventos.classes.tipo;

import com.hellow.eventos.classes.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo,Integer> {
}
