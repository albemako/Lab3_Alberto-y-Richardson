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
public class Locales {
    private String nombre;
    private int piso;
    private ArrayList <Empleado> empleados = new ArrayList();
    private Empleado em_encargado;

    public Locales() {
    }

    public Locales(String nombre, int piso, ArrayList<Empleado> empleados, Empleado em_encargado) {
        this.nombre = nombre;
        this.piso = piso;
        this.empleados = empleados;
        this.em_encargado = em_encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empleado getEm_encargado() {
        return em_encargado;
    }

    public void setEm_encargado(Empleado em_encargado) {
        this.em_encargado = em_encargado;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", empleados=" + empleados + ", em_encargado=" + em_encargado + '}';
    }
    
    
    
    
    
}
