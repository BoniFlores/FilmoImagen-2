package mx.edu.uttt.patern.object.factory;

import mx.edu.uttt.patern.object.Conexion.ConexionBD;
import mx.edu.uttt.patern.object.DTO.DTOPelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.edu.uttt.patern.object.modelo.AbstractPelicula;
import mx.edu.uttt.patern.object.modelo.NullPelicula;
import mx.edu.uttt.patern.object.modelo.RealPelicula;

/**
 *
 * @author BONI
 */
public class PeliculaFactory {

    public ArrayList<DTOPelicula> buscarNombre(String name) {
        ArrayList<DTOPelicula> listape = new ArrayList<DTOPelicula>();
        PreparedStatement cst;
        Connection con = new ConexionBD().obtenerConexion();
        ResultSet rs;
        try {

            cst = con.prepareStatement("SELECT ID,NOMBRE,GENERO,PRECIO FROM PELICULA WHERE NOMBRE='" + name + "'");
            rs = cst.executeQuery();
            while (rs.next()) {
                DTOPelicula peli = new DTOPelicula();
                
                peli.setId(rs.getInt(1));
                peli.setNombre(rs.getString(2));
                peli.setGenero(rs.getString(3));
                peli.setPrecio(rs.getDouble(4));
                listape.add(peli);
                if (peli.toString().equalsIgnoreCase(name)) {}
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());

        } finally {
            NullPelicula nu = new NullPelicula();
            JOptionPane.showMessageDialog(null, nu.getNombre());
        }
        return listape;
    }
}
