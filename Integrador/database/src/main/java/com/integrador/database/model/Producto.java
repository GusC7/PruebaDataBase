package com.integrador.database.model;

import javax.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String nombre;
    private String descripcion;
    private double precio;
}
