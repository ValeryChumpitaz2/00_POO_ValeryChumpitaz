package vallegrande.edu.pe.demo.model;

public class Perfil {

    private String nombre;
    private String carrera;
    private String semestre;

    public Perfil(String nombre, String carrera, String semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public String obtenerPresentacion() {
        return "Hola, soy " + nombre +
                "\nCarrera: " + carrera +
                "\nSemestre: " + semestre;
    }
}