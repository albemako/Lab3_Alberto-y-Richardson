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
public class Ropa extends Productos{
    private String talla;
    private boolean sexo;//true--hombre  y false--mujeres

    public Ropa() {
        super();
    }

    public Ropa(String talla, boolean sexo) {
        this.talla = talla;
        this.sexo = sexo;
    }

    public Ropa(String talla, boolean sexo, int precio, String descripcion, String marca, double descuento) {
        super(precio, descripcion, marca, descuento);
        this.talla = talla;
        this.sexo = sexo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
