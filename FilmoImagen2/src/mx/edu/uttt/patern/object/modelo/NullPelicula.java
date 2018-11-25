/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.patern.object.modelo;

/**
 *
 * @author Jazz
 */
public class NullPelicula extends AbstractPelicula{
    @Override
    
    public String getNombre(){
        return "NO EXISTE UN REGISTRO VALIDO EN LA DASE DE DATOS";
    }
    @Override
    public boolean isNil(){
        return true;
    }

    @Override
    public int getId() {
        return Integer.parseInt("NO EXISTE UN REGISTRO VALIDO EN LA DASE DE DATOS");
    }

    @Override
    public String getGenero() {
        return "NO EXISTE UN REGISTRO VALIDO EN LA DASE DE DATOS";
    }

    @Override
    public double getPrecio() {
        return Double.parseDouble("NO EXISTE UN REGISTRO VALIDO EN LA DASE DE DATOS");
    }
}
