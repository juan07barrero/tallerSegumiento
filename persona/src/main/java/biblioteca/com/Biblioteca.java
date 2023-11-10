package biblioteca.com;
/*
Biblioteca: Una clase que implemente la interfaz Préstamo y 
gestione la colección de libros disponibles y los registros de préstamos 
realizados por los clientes. Debe incluir métodos para prestar libros, 
así como para mantener un registro de préstamos.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import javax.xml.crypto.Data;

public class Biblioteca implements Prestamo {
    private Collection<Libro> LibrosDisponibles;
    private ArrayList<PrestamoLibro> librosPrestados;
    private ArrayList<PrestamoLibro> librosDevueltos;

    private ArrayList<Cliente> clientes;

    public Collection<Libro> getLibrosDisponibles() {
        return LibrosDisponibles;
    }

    public ArrayList<PrestamoLibro> getLibrosDevueltos() {
        return librosDevueltos;
    }

    public ArrayList<PrestamoLibro> getLibrosPrestados() {
        return librosPrestados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Biblioteca() {
        LibrosDisponibles = new ArrayList<>();
        librosPrestados = new ArrayList<>();
        librosDevueltos = new ArrayList<>();
        clientes = new ArrayList<>();

    }

    /* Agregamos todos los libros que se han prestado */
    public void prestarLibro(Libro libro, Cliente cliente) {

        PrestamoLibro prestamoLibro = new PrestamoLibro(libro, cliente, null);

        librosPrestados.add(prestamoLibro);

    }
    /* Libros que se han devuelto */

    public void devolveLibro(Libro libro, Cliente cliente) {

        for (PrestamoLibro i : librosPrestados) {

            if (i.getLibro().equals(libro)) {

                librosDevueltos.add(i);
            }

        }

    }

    /* funcion para buscar un libro por Autor */

    public boolean BuscarLibroPorAutor(Libro libro) {
        boolean centinela = false;
        for (Libro libro2 : LibrosDisponibles) {
            if (libro.getAutor().equals(libro2.getAutor())) {
                centinela = true;
                break;

            }

        }

        return centinela;
    }

    /* buscar libro por titulo */
    public boolean BuscarLibroPorTitulo(Libro libro) {
        boolean centinela = false;
        for (Libro libro2 : LibrosDisponibles) {
            if (libro.getTitulo().equals(libro2.getTitulo())) {
                centinela = true;
                break;

            }

        }

        return centinela;
    }

    /*
     * generar informes de préstamos de un libro
     * (devolver una colección de los préstamos que se han realizado a un libro
     * recibido por parámetro).
     */
    public ArrayList<PrestamoLibro> PrestamosDeCadaLibro(Libro libro) {
        ArrayList<PrestamoLibro> prestamo = new ArrayList<>();
        for (PrestamoLibro i : librosPrestados) {
            if (i.getLibro().equals(libro)) {

                prestamo.add(i);

            }

        }

        return prestamo;
    }

    /* registrar libro */
    public void registrarLibro(Libro libro) {

        LibrosDisponibles.add(libro);

    }

    /* Registrar un cliente */
    public void RegistrarCliente(Cliente cliente) {
        clientes.add(cliente);

    }

    /*
     * registrar devolución de un libro ( debe recibir de parámetro un libro y la
     * fecha del prestamos,
     * buscar el registro del préstamo que cumpla con esos criterios y asignar en
     * fecha de devolución la fecha actual)
     */

}
