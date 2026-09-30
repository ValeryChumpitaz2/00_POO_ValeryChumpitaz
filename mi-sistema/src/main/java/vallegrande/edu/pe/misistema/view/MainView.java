package vallegrande.edu.pe.misistema.view;


import java.util.List;


import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


import vallegrande.edu.pe.misistema.model.Usuario;


public class MainView extends BorderPane {


    // Botones del menú
    private Button btnInicio;
    private Button btnUsuarios;


    // Tabla donde mostraremos los usuarios
    private TableView<Usuario> tablaUsuarios;


    public MainView() {


        // Creamos el menú
        crearMenu();


        // Creamos la tabla
        crearTabla();


        // Mostramos Inicio al abrir el sistema
        mostrarInicio();
    }


    // Crea el menú lateral
    private void crearMenu() {


        // Contenedor vertical para el menú
        VBox menu = new VBox(15);


        // Espaciado interno
        menu.setPadding(new Insets(25));


        // Ancho del menú
        menu.setPrefWidth(220);


        // Título del sistema
        Label titulo = new Label("MI SISTEMA");


        titulo.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );


        // Creamos los botones
        btnInicio = crearBoton("Inicio");


        btnUsuarios = crearBoton("Usuarios");


        // Agregamos los elementos al menú
        menu.getChildren().addAll(
                titulo,
                btnInicio,
                btnUsuarios
        );


        // Color del menú
        menu.setStyle(
                "-fx-background-color: #2563EB;"
        );


        // Colocamos el menú a la izquierda
        setLeft(menu);
    }


    // Crea un botón del menú
    private Button crearBoton(String texto) {
        Button boton = new Button(texto);
        boton.setPrefWidth(170);
        boton.setPrefHeight(40);
        return boton;
    }


    // Muestra la pantalla de inicio
    public void mostrarInicio() {


        // Contenedor del contenido
        VBox contenido = new VBox(10);


        // Centramos el contenido
        contenido.setAlignment(Pos.CENTER);


        // Título
        Label titulo = new Label("BIENVENIDO");


        titulo.setStyle(
                "-fx-font-size: 28px;" +
                        "-fx-font-weight: bold;"
        );


        // Texto de bienvenida
        Label texto = new Label(
                "Sistema de gestión de usuarios"
        );


        // Agregamos los elementos
        contenido.getChildren().addAll(
                titulo,
                texto
        );


        // Mostramos el contenido en el centro
        setCenter(contenido);
    }


    // Muestra la pantalla de usuarios
    public void mostrarUsuarios() {


        // Contenedor del contenido
        VBox contenido = new VBox(20);


        contenido.setPadding(new Insets(30));


        // Título de la pantalla
        Label titulo = new Label("USUARIOS");


        titulo.setStyle(
                "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );


        // Agregamos título y tabla
        contenido.getChildren().addAll(
                titulo,
                tablaUsuarios
        );


        // Mostramos el contenido en el centro
        setCenter(contenido);
    }


    // Crea la tabla de usuarios
    private void crearTabla() {


        // Creamos la tabla
        tablaUsuarios = new TableView<>();


        // Creamos las columnas
        TableColumn<Usuario, Integer> colId =
                new TableColumn<>("ID");


        TableColumn<Usuario, String> colNombre =
                new TableColumn<>("Nombre");


        TableColumn<Usuario, String> colApellido =
                new TableColumn<>("Apellido");


        TableColumn<Usuario, String> colCorreo =
                new TableColumn<>("Correo");


        TableColumn<Usuario, String> colEstado =
                new TableColumn<>("Estado");


        // Indicamos qué atributo mostrará cada columna
        colId.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );


        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre")
        );


        colApellido.setCellValueFactory(
                new PropertyValueFactory<>("apellido")
        );


        colCorreo.setCellValueFactory(
                new PropertyValueFactory<>("correo")
        );


        colEstado.setCellValueFactory(
                new PropertyValueFactory<>("estado")
        );


        // Agregamos las columnas a la tabla
        tablaUsuarios.getColumns().addAll(
                colId,
                colNombre,
                colApellido,
                colCorreo,
                colEstado
        );
    }


    // Recibe los usuarios y los muestra en la tabla
    public void mostrarDatosUsuarios(List<Usuario> usuarios) {


        // Convertimos la lista a una colección observable
        tablaUsuarios.setItems(
                FXCollections.observableArrayList(usuarios)
        );
    }


    // Permite que el Controller acceda al botón Inicio
    public Button getBtnInicio() {


        return btnInicio;
    }


    // Permite que el Controller acceda al botón Usuarios
    public Button getBtnUsuarios() {


        return btnUsuarios;
    }
}

