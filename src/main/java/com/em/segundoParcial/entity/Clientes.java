package com.em.segundoParcial.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    
    private int idcliente;
    private String primernombre;
    private String segundonombre;
    private String otronombre;
    private String primerapellido;
    private String segundoapellido;
    private String otroapellido;
    private String genero;
    private Date fechanacimiento;
    private String segmento;
    private float sueldo;
    private String dpi;
    private String correo;
    private String telefono;
    private String direccion;
    private Timestamp fechacreacion;
}
