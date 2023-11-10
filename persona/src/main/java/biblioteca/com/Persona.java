package biblioteca.com;

/*
Una clase abstracta que representa a una persona con atributos como nombre, apellido, y edad.
Esta clase debe tener métodos abstractos para obtener y establecer estos atributos.




 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public abstract void setNombre(String nombre);

    public abstract void setApellido(String apellido);

    public abstract void setEdad(int edad);

    public abstract String getNombre();

    public abstract String getApellido();

    public abstract int getEdad();

}
