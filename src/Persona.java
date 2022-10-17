public class Persona {
    private String nombre;
    private  String apellido;
    private String dni;
    private String telefono;
    private String emai;

    public Persona(String nombre, String apellido, String dni, String telefono, String emai) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.emai = emai;
    }

    public String DarNombreCompleto(){
        return nombre + " " + apellido;
    }
}
