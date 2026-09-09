package vallegrande.edu.pe.misistema.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {
    private Button btnInicio;
    private Button btnUsuarios;
    private Button btnProductos;

    public MainView(){
        crearMenu();
        mostrarInicio();
    }
    private void crearMenu(){
        VBox menu = new VBox(15);
        menu.setPadding(Insets(25));
        menu.setPrefWidth(220);
        Label titulo = new Label("🖥️ MI SISTEMA");
        titulo.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );
        btnInicio = crearBoton("Inicio");
        btnUsuarios = crearBoton("Usuarios");
        btnProductos = crearBoton("Productos");
        menu.getChildren().addAll(
                titulo,
                btnInicio,
                btnUsuarios,
                btnProductos
        );
        menu.setStyle("-fx-background-color: #2563EB;");
        setLeft(menu);
    }
    private Button crearBoton(String texto){
        Button boton = new Button(texto);
        boton.setPrefWidth(170);
        boton.setPrefHeight(40);
        boton.setStyle("-fx-background-color: white;" +
                "-fx-text-fill: #1E3A8A;" +
                "-fx-font-size: 14px;" +
                "-fx-background-radius: 8;"
        );
        return boton;
    }
    public void mostrarInicio(){
        VBox contenido = new VBox(10);
        contenido.setAlignment(Pos.CENTER);
        Label titulo = new Label("BIENVENIDO ");
        titulo.setStyle("-fx-font-size: 28px;" +
                "-fx-font-weight: bold;");
        Label texto = new Label("Panel principal de mi sistema");
        contenido.getChildren().addAll(
                titulo,
                texto
        );
        setCenter(contenido);
    }
}
