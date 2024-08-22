package com.hellow.eventos.controller;

import com.hellow.eventos.classes.Midia;
import com.hellow.eventos.classes.MidiaRepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "midia")
public class MidiaController {
    @Autowired
    private MidiaRepository midiaRepository;

    @GetMapping("todos")
    public List<Midia> getALLMidia(){
        return this.midiaRepository.findAll();
    }

    @PostMapping("add")
    public Midia addMidia(@RequestBody Midia midia){
        this.midiaRepository.save(midia);
        return midia;
    }

}
