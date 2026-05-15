package proyecto.code.dao.impl;

import proyecto.code.model.Videojuego;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideojuegoDAOImpl{

    public Videojuego obtenerVideojuegoPorTitulo(Connection DatabaseConfig,String titulo){

        String consulta = "SELECT * FROM Videojuego WHERE Titulo = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){
            stmt.setString(1,titulo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Videojuego(
                        rs.getInt("Id_Videojuego"),
                        rs.getString("Titulo"),
                        rs.getString("Descripcion_Videojuego"),
                        rs.getString("Clasificacion_edad"),
                        rs.getInt("Id_Desarrollador"),
                        rs.getInt("Id_Personaje")
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String obtenerDescrpcionPorTitulo(Connection DatabaseConfig, String titulo) {
        String consulta ="SELECT Descripcion_Videojuego FROM Videojuego WHERE Titulo = ?";

        try(PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setString(1, titulo);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString("Descripcion_Videojuego");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getDesarrollador(Connection DatabaseConfig, int idDesarrollador) {
        String consulta ="SELECT Nombre_Desarrollador FROM Desarrollador WHERE Id_Desarrollador = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){
            stmt.setInt(1,idDesarrollador);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getDistribuidor(Connection DatabaseConfig, int idVideojuego) {
        String consulta ="SELECT Nombre_Distribuidor FROM Distribuidor d INNER JOIN Videojuego_Distribuidor vd ON d.Id_Distribuidor = vd.Id_Distribuidor WHERE vd.Id_Videojuego = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setInt(1,idVideojuego);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getDiseniador(Connection DatabaseConfig, int idVideojuego) {
        String consulta ="SELECT Nombre_Diseñador FROM Diseñador d INNER JOIN Videojuego_Diseñador vd ON d.Id_Distribuidor = vd.Id_Distribuidor WHERE vd.Id_Videojuego = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setInt(1,idVideojuego);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getPlataforma(Connection DatabaseConfig, int idVideojuego) {
        String consulta ="SELECT Nombre_Plataforma FROM Plataforma p INNER JOIN Videojuego_Plataforma vp ON p.Id_Plataforma = vp.Id_Plataforma WHERE vp.Id_Videojuego = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setInt(1,idVideojuego);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getGenero(Connection DatabaseConfig, int idVideojuego) {
        String consulta ="SELECT Nombre_Genero FROM Genero g INNER JOIN Videojuego_Genero vg ON g.Id_Genero = vg.Id_Genero WHERE vg.Id_Videojuego = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setInt(1,idVideojuego);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getModo(Connection DatabaseConfig, int idVideojuego) {
        String consulta ="SELECT Nombre_Modo FROM ModoDeJuego m INNER JOIN Videojuego_ModoDeJuego vm ON m.Id_ModoJuego = vm.Id_ModoJuego WHERE vm.Id_Videojuego = ?";

        try (PreparedStatement stmt = DatabaseConfig.prepareStatement(consulta)){

            stmt.setInt(1,idVideojuego);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
