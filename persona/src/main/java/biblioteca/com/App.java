package biblioteca.com;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Libro libro = new Libro("LA DIVINA COMEDIA", "JUAN JOSE BARRERO", 3);
        Cliente cliente = new Cliente(1, libro, "BRAYAN ", "CORDOBA", 19);
        Empleado empleado = new Empleado("Sebastian","Barrero",25,Cargo.GERENTE);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLibro(libro);
        System.out.println("EL NOMBRE DEL LIBRO ES" + libro.getTitulo());
        /* buscar libro por autor, esta funcion nos retorna un dato tipo boolean */
        System.out.println(biblioteca.BuscarLibroPorAutor(libro));
        /* buscar libro por titulo, esta funcion nos retorna un dato tipo boolean */
        System.out.println(biblioteca.BuscarLibroPorTitulo(libro));
        /* registrarcliente */
        biblioteca.RegistrarCliente(cliente);
        System.out.println(biblioteca.getClientes().size());
        /* registrar el prestamo de un libro */
        biblioteca.prestarLibro(libro, cliente);
        System.out.println(biblioteca.getLibrosPrestados().size());
        /* registrar la devolucion de un libro */
        biblioteca.devolveLibro(libro, cliente);
        /* registro de los libros devueltos */
        System.out.println(biblioteca.getLibrosDevueltos().size());
        /* Aqui miramos el registro de cada libro prestado */
        ArrayList<PrestamoLibro> nn = new ArrayList<>();
        nn = biblioteca.PrestamosDeCadaLibro(libro);
        PrestamoLibro Prestamo = nn.get(0);
        System.out.println(Prestamo.getLibro().getTitulo());

    }
}
