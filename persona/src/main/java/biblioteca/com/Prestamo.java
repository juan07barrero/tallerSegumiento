package biblioteca.com;

/*
Prestamo: Una interfaz que define métodos para realizar préstamos y devoluciones de libros. */
public interface Prestamo {
    void prestarLibro(Libro libro, Cliente cliente);

    void devolveLibro(Libro libro, Cliente cliente);

}
