package mx.edu.uttt.patern.object.DAO;

import mx.edu.uttt.patern.object.Interfaz.IOperaciones;
import mx.edu.uttt.patern.object.DTO.DTOPelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mx.edu.uttt.patern.object.Conexion.ConexionBD;
/**
 *
 * @author BONI
 */
public class DAO implements IOperaciones<DTOPelicula>{

    @Override
    public boolean insertar(DTOPelicula obj) {
        PreparedStatement pst;
        Connection con = new ConexionBD().obtenerConexion();
        String query = "INSERT INTO PELICULA (NOMBRE, GENERO, PRECIO) VALUES (?,?,?)";
        try {
            pst=con.prepareStatement(query);
            pst.setString(1, obj.getNombre());
            pst.setString(2, obj.getGenero());
            pst.setDouble(3, obj.getPrecio());
            //System.out.println(pst.executeUpdate());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {

        }
        return true;
    }

    @Override
    public boolean eliminar(DTOPelicula obj) {
        PreparedStatement pst;
        Connection con = new ConexionBD().obtenerConexion();
        String query = "DELETE FROM PELICULA WHERE NOMBRE=?";
        try {
            pst=con.prepareStatement(query);
            pst.setString(1, obj.getNombre());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {

        }
        return true;
        
    }

    @Override
    public boolean actualizar(DTOPelicula obj) {
        PreparedStatement pst;
        Connection con = new ConexionBD().obtenerConexion();
        String query="UPDATE PELICULA SET GENERO=?, PRECIO=? WHERE NOMBRE=?";
        
        try {
            pst=con.prepareStatement(query);
            pst.setString(1, obj.getGenero());
            pst.setDouble(2, obj.getPrecio());
            pst.setString(3, obj.getNombre());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {

        }
        return true;
    }

    @Override
    public ArrayList<DTOPelicula> consultarTodo() {
        ArrayList<DTOPelicula> listape = new ArrayList<DTOPelicula>();
        PreparedStatement cst;
        Connection con = new ConexionBD().obtenerConexion();

        ResultSet rs;
        try {
           cst = con.prepareStatement("SELECT ID, NOMBRE, GENERO, PRECIO FROM PELICULA");
            rs = cst.executeQuery();
            while (rs.next()) {
                DTOPelicula peli= new DTOPelicula();
                //System.out.println(peli.getId()+" "+peli.getNombre()+" "+peli.getGenero()+" "+peli.getPrecio());
                peli.setId(rs.getInt(1));
                peli.setNombre(rs.getString(2));
                peli.setGenero(rs.getString(3));
                peli.setPrecio(rs.getDouble(4));
                listape.add(peli);
            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {
            
        }
        return listape;
    }
}
