package vallegrande.edu.pe.misistema.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {


    // Consulta los usuarios de la base de datos
    public List<Usuario> listar() {


        List<Usuario> lista = new ArrayList<>();


        String sql = "SELECT * FROM usuarios";


        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {


            while (rs.next()) {


                Usuario u = new Usuario();


                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setCorreo(rs.getString("correo"));
                u.setEstado(rs.getString("estado"));


                lista.add(u);
            }


        } catch (SQLException e) {


            e.printStackTrace();
        }


        return lista;
    }


    public void insertar(Usuario usuario) {

        String sql = """
               INSERT INTO usuarios
               (nombre, apellido, correo, estado)
               VALUES (?, ?, ?, ?)
               """;


        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {


            // Enviamos los datos del objeto a la consulta
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getEstado());


            stmt.executeUpdate();


        } catch (SQLException e) {


            e.printStackTrace();
        }
    }
    public void actualizar (Usuario usuario) {
        String sql = """
                UPDATE usuarios
                SET nombre = ?,
                    apellido = ?,
                    correo = ?,
                    estado = ?
                WHERE id = ?
                """;
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getEstado());
            stmt.setInt(5, usuario.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar (int id ){
        String sql = """
                DELETE FROM usuarios
                WHERE id = ?
                """;
        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch ( SQLException e) {
            e.printStackTrace();
        }

    }
}

