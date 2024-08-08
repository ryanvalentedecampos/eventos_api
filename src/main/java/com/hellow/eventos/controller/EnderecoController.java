package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.Enderecorepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "endereco")
public class EnderecoController {
    @Autowired
    private Enderecorepository enderecorepository;

    @GetMapping("todos")
    public List<Endereco> getALLendereco(){return this.enderecorepository.findAll();}


    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        this.enderecorepository.save(endereco);
        return endereco;
    }

}
