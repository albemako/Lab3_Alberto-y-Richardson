/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_programacionii;

import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Cliente {
    private ArrayList <Productos> productos;
    private double dinero;

    public Cliente() {
    }

    public Cliente(ArrayList<Productos> productos, double dinero) {
        this.productos = productos;
        this.dinero = dinero;
    }

    public Cliente(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "productos=" + productos + ", dinero=" + dinero + '}';
    }
    
    
    
}
