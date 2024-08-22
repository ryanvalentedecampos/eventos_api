package com.hellow.eventos.controller;

import com.hellow.eventos.classes.Ingresso;
import com.hellow.eventos.classes.IngressoRepository;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "ingresso")
public class IngressoController {
    @Autowired
    private IngressoRepository ingressoRepository;

    @GetMapping("todos")
    public List<Ingresso> getALLingresso() {
        return this.ingressoRepository.findAll();
    }


    @PostMapping("add")
    public Ingresso addIngresso(@RequestBody Ingresso Ingresso) {
        this.ingressoRepository.save(Ingresso);
        return Ingresso;
    }
}