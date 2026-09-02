package vallegrande.edu.pe.miperfil.controller;

import vallegrande.edu.pe.miperfil.model.Perfil;
import vallegrande.edu.pe.miperfil.view.PerfilView;

public class PerfilController {
    private PerfilView view;
    public  PerfilController(PerfilView view){
    this.view = view;
    view.getBtnMostrar().setOnAction( e -> mostrarPerfil());
    }
    private void mostrarPerfil(){
            String nombre = view.getTxtNombre().getText();
            String carrera = view.getTxtCarrera().getText();
            String semestre = view.getTxtSemestre().getText();
            Perfil perfil = new Perfil(
                    nombre,
                    carrera,
                    semestre
            );
            view.getLblResultado().setText(
                    perfil.obtenerPresentacion()
            );

    }
}
