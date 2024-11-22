package com.poo2.integrador.modelo;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity // Indica que esta clase es una entidad JPA
@Table(name = "producto") // Nombre de la tabla en la base de datos
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de generación automática del ID
    private Long id;

    @Column(nullable = false, length = 100) // Campo obligatorio, con longitud máxima de 100 caracteres
    private String nombre;

    @Column(length = 500) // Campo opcional, con longitud máxima de 500 caracteres
    private String descripcion;

    @Column(nullable = false, precision = 10, scale = 2) // Manejo preciso de valores monetarios
    private BigDecimal precio;

    @Column(nullable = false) // El stock no puede ser nulo
    private int stock;

    @Column(nullable = false) // Descuento obligatorio, aunque sea 0
    private double descuento;

    @Column(nullable = false) // Indica si el producto está disponible
    private boolean disponible;

    @Column(length = 50) // Categoría opcional, con longitud máxima de 50 caracteres
    private String categoria;

    // Constructor vacío (requerido por JPA)
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(Long id, String nombre, String descripcion, BigDecimal precio, int stock, double descuento, boolean disponible, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.descuento = descuento;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    // Métodos Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para calcular el precio final aplicando el descuento
    public BigDecimal calcularPrecioConDescuento() {
        if (descuento > 0 && descuento <= 100) {
            BigDecimal descuentoDecimal = BigDecimal.valueOf(descuento).divide(BigDecimal.valueOf(100));
            return precio.subtract(precio.multiply(descuentoDecimal));
        }
        return precio;
    }

    // Método para verificar si hay stock suficiente
    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }

    // Método para reducir el stock
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad insuficiente en el stock.");
        }
    }

    // Método toString (opcional, para depuración o impresión)
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", descuento=" + descuento +
                ", disponible=" + disponible +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
