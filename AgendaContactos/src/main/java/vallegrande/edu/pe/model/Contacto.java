package vallegrande.edu.pe.model;

public class Contacto {

    //Atributos
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;

    private String telefono;
    private String correo;

    //Método para registrar
    public void registrarContacto(){
        System.out.println("Contacto Registrado.");
    }

    //Método para mostrar
    public void mostrarContacto(){
        System.out.println("Hola mi nombre es Valery");
    }

    public void mostrarDireccion(){
        System.out.println("mi direccion es Cañete");
    }

}
