package biblioteca.com;
/*Cliente: Otra clase que herede de Persona, representando a un cliente de la biblioteca.
 Debe incluir un atributo para el número de cliente y una colección de los préstamos que el ha realizado.
 */

import java.util.ArrayList;

public class Cliente extends Persona {
    private int numeroCliente;
    private Libro libro;
    private ArrayList<Libro> prestamos;

    public Cliente(int numeroCliente, Libro libro, String nombre, String apellido, int edad) {
        this.numeroCliente = numeroCliente;
        prestamos = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public void AgregarLibrosPrestados() {
        prestamos.add(libro);
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public ArrayList<Libro> getPrestamos() {
        return prestamos;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
