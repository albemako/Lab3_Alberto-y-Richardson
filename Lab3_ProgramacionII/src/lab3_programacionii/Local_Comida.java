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
public class Local_Comida  extends Locales{
    private String prod_comida;//tiene un 50 por ciento de descuento

    public Local_Comida() {
        super();
    }

    public Local_Comida(String prod_comida, String nombre, int piso, Empleado em_encargado) {
        super(nombre, piso, em_encargado);
        this.prod_comida = prod_comida;
    }



    public String getProd_comida() {
        return prod_comida;
    }

    public void setProd_comida(String prod_comida) {
        this.prod_comida = prod_comida;
    }

    @Override
    public String toString() {
        return "Local_Comida{" + "prod_comida=" + prod_comida + '}';
    }
    
    
        
}
