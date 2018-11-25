/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.patern.object.Controlador;

import mx.edu.uttt.patern.object.DAO.DAO;
import mx.edu.uttt.patern.object.Interfaz.IOperaciones;
import mx.edu.uttt.patern.object.DTO.DTOPelicula;
import java.util.ArrayList;
import mx.edu.uttt.patern.object.factory.PeliculaFactory;

/**
 *
 * @author BONI
 */
public class ConPeliculas implements IOperaciones<DTOPelicula>{

    @Override
    public boolean insertar(DTOPelicula obj) {
        return new DAO().insertar(obj);
    }

    @Override
    public boolean eliminar(DTOPelicula obj) {
        return new DAO().eliminar(obj);
    }

    @Override
    public boolean actualizar(DTOPelicula obj) {
        return new DAO().actualizar(obj);
    }

    @Override
    public ArrayList<DTOPelicula> consultarTodo() {
        return new DAO().consultarTodo();
    }
    public ArrayList<DTOPelicula> buscarNombre(String name) {
        return new PeliculaFactory().buscarNombre(name);
    }

}
