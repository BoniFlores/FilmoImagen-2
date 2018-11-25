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
public class RealPelicula extends AbstractPelicula{

//    public RealPelicula(int idP,String name,String Genero,double Precio) {
//        this.id=idP;
//        this.nombre=name;
//        this.genero=Genero;
//        this.precio=Precio;
//    }
    
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}