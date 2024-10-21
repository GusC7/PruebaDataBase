package Ejercicio1;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        libro.prestar();
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void devolver() {
        libro.devolver();
    }
}
