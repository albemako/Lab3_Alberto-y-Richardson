/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_programacionii;

/**
 *
 * @author RALC
 */
public class Tienda extends Locales{
    private int tamaño;//Tamaño en mts al cuadro

    public Tienda() {
        super();
    }

    public Tienda(int tamaño) {
        setTamaño(tamaño);
    }
    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        if (tamaño >= 18) {
            this.tamaño = tamaño;
        }
    }
    
    
    
}
