package vallegrande.edu.pe.app;

import vallegrande.edu.pe.controller.AgendaController;
import vallegrande.edu.pe.model.Contacto;
import vallegrande.edu.pe.view.AngendaView;

public class Main {
    public static void main(String[] args) {
        //Crear los componentes
        AngendaController controller = new AgendaController();
        AngendaView view = new AngendaView();

        //Mostrar Informacion
        view.mostrarTitulo();

        //Crear contactos
        Contacto contacto1 = new Contacto(
                1,
                "Ana",
                "Torres",
                "Cañete",
                "983745656",
                "ana@gmail.com"
        );
        Contacto contacto2 = new Contacto(
                2,
                "Carlos",
                "Perez",
                "Imperial",
                "951264456",
                "carlos@gmail.com"
        );
        //Agregar contactos
         controller.agregarContacto(contacto1);
         controller.agegarContacto(contacto2);
         //Listar Contactos
        controller.listarContactos();
    }

}