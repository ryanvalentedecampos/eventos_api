package com.hellow.eventos.controller;

import com.hellow.eventos.classes.Fornecedor;
import com.hellow.eventos.classes.FornecedorRepository;
import com.hellow.eventos.classes.Ingresso;
import com.hellow.eventos.classes.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fornrcedor")
public class FornecedorController {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping("todos")
    public List<Fornecedor> getALLfornecedor() {
        return this.fornecedorRepository.findAll();
    }


    @PostMapping("add")
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor) {
        this.fornecedorRepository.save(fornecedor);
        return fornecedor;
    }
}