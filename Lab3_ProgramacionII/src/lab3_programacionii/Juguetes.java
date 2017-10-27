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
public class Juguetes extends Productos{
    private String tipo;//Rompezabezas, carro, otro

    public Juguetes(String tipo) {
        this.tipo = tipo;
    }

    public Juguetes(String tipo, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.tipo = tipo;
    }

    public Juguetes() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "tipo=" + tipo + '}';
    }
    
    

    
    
    
    
    
    
}
