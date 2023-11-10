package biblioteca.com;

/*
PrestamoRegistro: Una clase que representa un préstamo realizado, 
debe tener el libro, el cliente, la fecha de préstamo. */
public class PrestamoLibro {
    private Libro libro;
    private Cliente cliente;
    private String fechaPrestamo;

    public PrestamoLibro(Libro libro, Cliente cliente, String fechaPrestamo) {
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;

    }

    public Libro getLibro() {
        return libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

}
