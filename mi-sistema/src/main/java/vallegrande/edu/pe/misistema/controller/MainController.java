package vallegrande.edu.pe.misistema.controller;

import vallegrande.edu.pe.misistema.model.Usuario;
import vallegrande.edu.pe.misistema.model.UsuarioDAO;
import vallegrande.edu.pe.misistema.view.MainView;

import java.util.List;

public class MainController {

   private MainView view;
   private UsuarioDAO usuarioDAO;

   public MainController(MainView view){
       this.view = view;
       usuarioDAO = new UsuarioDAO();
       configurarEventos();
   }
   public void configurarEventos() {
       view.getBtnInicio().setOnAction(e -> {
           view.mostrarInicio();
       });
       view.getBtnUsuarios().setOnAction(e -> {
           view.mostrarUsuarios();
           cargarUsuarios();
       });
       view.getBtnRegistrar().setOnAction(e->{
           registrarUsuario();
       });
   }
    private void cargarUsuarios(){
        List<Usuario> usuarios = usuarioDAO.listar();
        view.mostrarDatosUsuarios(usuarios);
    }
    private void registrarUsuario(){
       Usuario usuario = new Usuario();
       usuario.setNombre(view.getNombre());
       usuario.setApellido(view.getApellido());
       usuario.setCorreo(view.getCorreo());
       usuario.setEstado(view.getEstado());
       usuarioDAO.insertar(usuario);
       cargarUsuarios();
    }
}
