package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Libro;

import java.util.ArrayList;

public class BibliotecaController {

    //Lista donden almacenaremos nuestros libros
    private ArrayList<Libro> libros;

    //Constructor
    public BibliotecaController(){
        libros = new ArrayList<>();
    }

    //Registrar
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro registrado correctamente");
    }

    //Listar
    public void listarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros registrados");
            return;
        }
        System.out.println("LISTA DE LIBROS");
        for ( Libro libro: libros){
            libro.mostrarLibro();
        }
    }


}
