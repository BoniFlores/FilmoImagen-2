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
public abstract class AbstractPelicula {
    protected int id;
    protected String nombre;
    protected String genero;
    protected double precio;
    public abstract boolean isNil();
    public abstract int getId();
    public abstract String getNombre();
    public abstract String getGenero();
    public abstract double getPrecio();
}
