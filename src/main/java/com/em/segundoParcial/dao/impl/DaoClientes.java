package com.em.segundoParcial.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.em.segundoParcial.dao.IDaoClientes;
import com.em.segundoParcial.entity.Clientes;

@Repository
@Transactional
public class DaoClientes implements IDaoClientes{

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Clientes> findAll() {
	try {
		List<Clientes> listaClientes = em.createQuery("from Clientes", Clientes.class).getResultList();
		return listaClientes;
	}catch (Exception e){
		e.printStackTrace();
		return null;
	}
	}

	@Override
	public Clientes findByID(int id) {
        try {
            Clientes cliente= em.find(Clientes.class,id);
            return cliente;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
	}

	@Override
	public Clientes save(Clientes cliente) {
		try {
			em.persist(cliente);
            return cliente;
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Clientes update(Clientes cliente) {
		try {
			em.merge(cliente);
            return cliente;
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
}
