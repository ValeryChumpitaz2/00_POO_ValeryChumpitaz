package vallegrande.edu.pe.model;

public class Libro {

    // ATRIBUTOS
    private int id;
    private String titulo;
    private String autor;
    private int anio;

    //CONSTRUCTOR
    public Libro(int id, String titulo, String autor, int anio){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    //GETTERS
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public int getAnio(){
        return anio;
    }

    //MOSTRAR LIBRO
    public void mostrarLibro(){
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Año: " + anio);
        System.out.println("------------------------------------");
    }
}
