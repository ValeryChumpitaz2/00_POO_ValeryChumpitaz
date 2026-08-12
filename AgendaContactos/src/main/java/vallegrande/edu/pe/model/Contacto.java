package vallegrande.edu.pe.model;

public class Contacto {

    //Atributos
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String correo;

   //Constructor
    public Contacto( int id, String nombres, String apellidos, String direccion, String telefono, String correo){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Método
    public void mostrarContacto(){
        System.out.println("ID:" + id);
        System.out.println("Nombre:" + nombres + "" + apellidos);
        System.out.println("Direccion:" + direccion);
        System.out.println("Telefono" + telefono);
        System.out.println("Correo:"+ correo);

        //Linea para separar visualmente un contacto otro
        System.out.println("-----------------------------------");
    }

}
