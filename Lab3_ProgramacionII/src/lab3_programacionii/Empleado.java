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
public class Empleado extends Personas{
    private String hora_trabajo;
    private int prod_vendidos;

    public Empleado(String hora_trabajo, int prod_vendidos, String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento, boolean empleado_cliente, boolean socio) {
        super(username, password, correo_electronico, nombre, id, fecha_nacimiento, empleado_cliente, socio);
        this.hora_trabajo = hora_trabajo;
        this.prod_vendidos = prod_vendidos;
    }

    public Empleado(String hora_trabajo, int prod_vendidos) {
        this.hora_trabajo = hora_trabajo;
        this.prod_vendidos = prod_vendidos;
    }

    public Empleado(String hora_trabajo, int prod_vendidos, String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento) {
        super(username, password, correo_electronico, nombre, id, fecha_nacimiento);
        this.hora_trabajo = hora_trabajo;
        this.prod_vendidos = prod_vendidos;
    }

    public Empleado(String hora_trabajo, int prod_vendidos, String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento, boolean empleado_cliente) {
        super(username, password, correo_electronico, nombre, id, fecha_nacimiento, empleado_cliente);
        this.hora_trabajo = hora_trabajo;
        this.prod_vendidos = prod_vendidos;
    }

    public Empleado() {
        super();
    }

    public String getHora_trabajo() {
        return hora_trabajo;
    }

    public void setHora_trabajo(String hora_trabajo) {
        this.hora_trabajo = hora_trabajo;
    }

    public int getProd_vendidos() {
        return prod_vendidos;
    }

    public void setProd_vendidos(int prod_vendidos) {
        this.prod_vendidos = prod_vendidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "hora_trabajo=" + hora_trabajo + ", prod_vendidos=" + prod_vendidos + '}';
    }
    
    
}
