/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_programacionii;

//import java.util.ArrayList;

/**
 *
 * @author RALC
 */
public class Quiosco extends Locales{
    private String nombre_tienda;

    public Quiosco() {
        super();
    }

    public Quiosco(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    @Override
    public String toString() {
        return "Quiosco{" + "nombre_tienda=" + nombre_tienda + '}';
    }
    
    

    
    
    
}
