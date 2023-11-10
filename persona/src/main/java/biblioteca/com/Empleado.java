package biblioteca.com;

/*
Empleado: Una clase que herede de Persona y representa a un empleado de la biblioteca.
 Debe tener un atributo adicional para el cargo, como "bibliotecario" o "gerente".
*/
public class Empleado extends Persona {
    private Cargo cargo;

    // Constructor
    public Empleado(String nombre, String apellido, int edad, Cargo cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
    }

    // Métodos para obtener y establecer el cargo
    public Cargo getCargo() {
        return cargo;
    }

    // Implementación de métodos abstractos heredados de Persona
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
