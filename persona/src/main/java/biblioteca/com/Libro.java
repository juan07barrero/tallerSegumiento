package biblioteca.com;

/*
Libro: Una clase que represente un libro de la biblioteca, 
con atributos como título, autor y número de ejemplares disponibles. */
public class Libro {
    private String Titulo;
    private String autor;
    private int numeroEjemplaresDisponibles;

    public Libro(String titulo, String autor, int numeroEjemplaresDisponibles) {
        Titulo = titulo;
        this.autor = autor;
        this.numeroEjemplaresDisponibles = numeroEjemplaresDisponibles;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroEjemplaresDisponibles() {
        return numeroEjemplaresDisponibles;
    }

    /* verificar si aun hay libros disponibles */
    public boolean VerificarLibrosDisponibles() {
        boolean centinela = true;

        return centinela;
    }

}
