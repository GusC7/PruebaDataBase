package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
