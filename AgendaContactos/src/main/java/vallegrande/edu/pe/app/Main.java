package vallegrande.edu.pe.app;

import vallegrande.edu.pe.model.Contacto;

public class Main {
    public static void main(String[] args) {
        //Crear objeto
        Contacto contacto = new Contacto();
        //Llamar métodos
        contacto.registrarContacto();
        contacto.mostrarContacto();
        contacto.mostrarDireccion();
}
}