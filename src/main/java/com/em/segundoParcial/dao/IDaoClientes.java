package com.em.segundoParcial.dao;

import java.util.List;

import com.em.segundoParcial.entity.Clientes;

public interface IDaoClientes {

	public List<Clientes> findAll();
	public Clientes findByID(int id);
	public Clientes save(Clientes cliente);
	public Clientes update(Clientes cliente);
	
}
