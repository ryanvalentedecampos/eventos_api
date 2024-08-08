package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "evento")
public class EventoController {
    @Autowired
    private EventoRepository eventorepository;

    @GetMapping("todos")
    public List<Evento> getALLevento(){
        return this.eventorepository.findAll();
    }


    @PostMapping("add")
    public Evento addEndereco(@RequestBody Evento evento){
        this.eventorepository.save(evento);
        return evento;
    }

}

