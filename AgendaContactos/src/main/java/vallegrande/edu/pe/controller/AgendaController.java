package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class AgendaController {

    //Lista Contactos ( Almacenar )
    private ArrayList <Contacto> contactos;

    //Constructor
    public AgendaController(){
        contactos = new ArrayList<>();
    }

    //Agregar Contacto
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
        System.out.println("Conctacto Agregado correctamente");
    }

    //Listar Contactos
    public void listarContactos(){
        System.out.println("LISTA DE CONTACTOS");
        for ( Contacto contacto : contactos){
            mostrarContacto().contacto.mostrarContacto();
        }
    }
}
