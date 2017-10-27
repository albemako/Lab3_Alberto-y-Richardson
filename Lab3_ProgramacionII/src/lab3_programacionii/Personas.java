/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_programacionii;

/**
 String resp = (String) JOptionPane.showInputDialog(null, 
                            "Seleccione el producto", "PRODUCTOS", 
                            JOptionPane.DEFAULT_OPTION, null, productos, productos[0]);* @author RALC
 */
public class Personas {
    private String username;
    private String password;
    private String correo_electronico;
    private String nombre;
    private int id;
    private String fecha_nacimiento;
    private boolean empleado_cliente;
    private boolean socio;

    public Personas(String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento, boolean empleado_cliente, boolean socio) {
        this.username = username;
        this.password = password;
        this.correo_electronico = correo_electronico;
        this.nombre = nombre;
        this.id = id;
        this.fecha_nacimiento = fecha_nacimiento;
        this.empleado_cliente = empleado_cliente;
        this.socio = socio;
    }

    public Personas() {
        super();
    }

    public Personas(String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento) {
        this.username = username;
        this.password = password;
        this.correo_electronico = correo_electronico;
        this.nombre = nombre;
        this.id = id;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Personas(String username, String password, String correo_electronico, String nombre, int id, String fecha_nacimiento, boolean empleado_cliente) {
        this.username = username;
        this.password = password;
        this.correo_electronico = correo_electronico;
        this.nombre = nombre;
        this.id = id;
        this.fecha_nacimiento = fecha_nacimiento;
        this.empleado_cliente = empleado_cliente;
    }

    public boolean isEmpleado_cliente() {
        return empleado_cliente;
    }

    public void setEmpleado_cliente(boolean empleado_cliente) {
        this.empleado_cliente = empleado_cliente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Personas{" + "username=" + username + ", password=" + password + ", correo_electronico=" + correo_electronico + ", nombre=" + nombre + ", id=" + id + ", fecha_nacimiento=" + fecha_nacimiento + ", empleado_cliente=" + empleado_cliente + ", socio=" + socio + '}';
    }

    

   
    
    
}
