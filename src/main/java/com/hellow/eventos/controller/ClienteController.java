package com.hellow.eventos.controller;

import com.hellow.eventos.classes.Cliente;
import com.hellow.eventos.classes.ClienteRepository;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.Enderecorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository Clienterepository;

    @GetMapping("todos")
    public List<Cliente> getALLcliente() {
        return this.Clienterepository.findAll();
    }


    @PostMapping("add")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        this.Clienterepository.save(cliente);
        return cliente;
    }
}
