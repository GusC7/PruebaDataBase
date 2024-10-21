package Ejercicio1;

public class Libro {
    private String titulo;
    private Autor autor;
    private int nroPaginas;
    private Estado estado;

    public Libro(String titulo, Autor autor, int nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.estado = Estado.DISPONIBLE;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void prestar() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.PRESTADO;
        }
    }

    public void devolver() {
        if (estado == Estado.PRESTADO) {
            estado = Estado.DISPONIBLE;
        }
    }
}

enum Estado {
    DISPONIBLE,
    PRESTADO
}

