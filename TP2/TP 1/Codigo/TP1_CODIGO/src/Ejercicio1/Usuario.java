package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}
