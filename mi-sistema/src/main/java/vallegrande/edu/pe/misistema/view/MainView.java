package vallegrande.edu.pe.misistema.view;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import vallegrande.edu.pe.misistema.model.Usuario;

public class MainView extends BorderPane {

    // Botones del menú
    private Button btnInicio;
    private Button btnUsuarios;

    // Campos del formulario
    private TextField txtNombre;
    private TextField txtApellido;
    private TextField txtCorreo;
    private TextField txtEstado;

    // Botón para registrar un usuario
    private Button btnRegistrar;

    // NUEVO: botones para actualizar y eliminar
    private Button btnActualizar;
    private Button btnEliminar;

    // Tabla donde mostraremos los usuarios
    private TableView<Usuario> tablaUsuarios;

    public MainView() {

        // Creamos el menú
        crearMenu();

        // Creamos la tabla
        crearTabla();

        // Creamos los campos y el botón del formulario
        crearFormulario();

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

        // Agregamos los campos del formulario,
        // los botones y la tabla
        contenido.getChildren().addAll(
                titulo,
                txtNombre,
                txtApellido,
                txtCorreo,
                txtEstado,
                btnRegistrar,

                // NUEVO: agregamos los botones
                // para actualizar y eliminar
                btnActualizar,
                btnEliminar,

                tablaUsuarios
        );

        // Mostramos el contenido en el centro
        setCenter(contenido);
    }

    // Crea los elementos del formulario
    private void crearFormulario() {

        // Campo para ingresar el nombre
        txtNombre = new TextField();

        // Texto de ayuda que aparece dentro del campo
        txtNombre.setPromptText("Nombre");

        // Campo para ingresar el apellido
        txtApellido = new TextField();

        // Texto de ayuda del campo
        txtApellido.setPromptText("Apellido");

        // Campo para ingresar el correo
        txtCorreo = new TextField();

        // Texto de ayuda del campo
        txtCorreo.setPromptText("Correo");

        // Campo para ingresar el estado
        txtEstado = new TextField();

        // Texto de ayuda del campo
        txtEstado.setPromptText("Estado");

        // Botón que permite registrar el usuario
        btnRegistrar = new Button("Registrar");

        // NUEVO: botón para actualizar un usuario
        btnActualizar = new Button("Actualizar");

        // NUEVO: botón para eliminar un usuario
        btnEliminar = new Button("Eliminar");
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

    // Permite que el Controller acceda al botón Registrar
    public Button getBtnRegistrar() {

        return btnRegistrar;
    }

    // Obtiene el nombre escrito en el formulario
    public String getNombre() {

        return txtNombre.getText();
    }

    // Obtiene el apellido escrito en el formulario
    public String getApellido() {

        return txtApellido.getText();
    }

    // Obtiene el correo escrito en el formulario
    public String getCorreo() {

        return txtCorreo.getText();
    }

    // Obtiene el estado escrito en el formulario
    public String getEstado() {

        return txtEstado.getText();
    }

    // NUEVO: permite que el Controller acceda
    // al botón Actualizar
    public Button getBtnActualizar() {

        return btnActualizar;
    }

    // NUEVO: permite que el Controller acceda
    // al botón Eliminar
    public Button getBtnEliminar() {

        return btnEliminar;
    }

    // NUEVO: obtiene el usuario seleccionado
    // en la TableView
    public Usuario getUsuarioSeleccionado() {

        return tablaUsuarios
                .getSelectionModel()
                .getSelectedItem();
    }

    // NUEVO: carga los datos del usuario
    // seleccionado en el formulario
    public void cargarUsuarioEnFormulario(Usuario usuario) {

        txtNombre.setText(usuario.getNombre());
        txtApellido.setText(usuario.getApellido());
        txtCorreo.setText(usuario.getCorreo());
        txtEstado.setText(usuario.getEstado());
    }

    // NUEVO: permite que el Controller acceda
    // a la tabla de usuarios
    public TableView<Usuario> getTablaUsuarios() {

        return tablaUsuarios;
    }
}