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
public class Cliente extends Personas{
    private ArrayList <Productos> productos;
    private double dinero;

    public Cliente() {
        super();
    }

    public Cliente(double dinero, String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento, boolean empleado_cliente, boolean socio) {
        super(username, password, correo_electronico, nombre, id, fecha_nacimiento, empleado_cliente, socio);
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
