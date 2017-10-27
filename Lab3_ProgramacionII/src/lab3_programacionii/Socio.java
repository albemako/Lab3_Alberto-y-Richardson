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
public class Socio extends  Personas{
    private ArrayList reportes;

    public Socio() {
    }

    public Socio(String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento) {
        super(username, password, correo_electronico, nombre, id, fecha_nacimiento);
    }

    public ArrayList getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList reportes) {
        this.reportes = reportes;
    }

    @Override
    public String toString() {
        return "Socio{" + "reportes=" + reportes + '}';
    }
    
    
    
}
