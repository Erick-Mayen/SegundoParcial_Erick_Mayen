package com.em.segundoParcial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.segundoParcial.dao.IDaoClientes;
import com.em.segundoParcial.entity.Clientes;

@RestController
@RequestMapping(value = "/parcial2")
public class ClientesController {

    @Autowired
    private IDaoClientes daoClientes;

    @GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clientes> getClientes(){
        return daoClientes.findAll();
    }

    @GetMapping(value = "/clientes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Clientes> findById(@PathVariable int id) {
		Clientes cliente = daoClientes.findByID(id);
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

    @PostMapping(value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Clientes saveClientes(@RequestBody Clientes cliente){
        return daoClientes.save(cliente);
    }

     @PutMapping(value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Clientes updateClientes(@RequestBody Clientes cliente){
        return daoClientes.update(cliente);
    }



}
