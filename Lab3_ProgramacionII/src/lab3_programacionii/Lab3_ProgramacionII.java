/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_programacionii;
//puse un comentario

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RALC
 */
public class Lab3_ProgramacionII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Locales>locales=new ArrayList();
        ArrayList <Personas>personas=new ArrayList();
        personas.add(new Socio("usuario", "contra", "usuario@yahoo.com", "usu", 199999, "fecha"));
        //login o registro
        String op="";
        while ( !op.equals("s") ) {  
            op=JOptionPane.showInputDialog(""
                    + "a-Registro para clientes\n"
                    + "b-Login\n"
                    + "s-salir");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                int id;
                double dinero;
                String usuario, contra, correo, nombre, fecha;
                nombre=JOptionPane.showInputDialog("nombre");
                usuario=JOptionPane.showInputDialog("usuario");
                contra=JOptionPane.showInputDialog("contrasenia");
                correo=JOptionPane.showInputDialog("correo");
                id=Integer.parseInt(
                  JOptionPane.showInputDialog("id")
                );
                fecha=JOptionPane.showInputDialog("fecha");
                dinero=Double.parseDouble(JOptionPane.showInputDialog("Dinero"));
                personas.add(new Cliente(dinero, usuario, contra, correo, nombre, id, fecha, true, false));
                JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
            }
            if (op.equals("b")){
                //login
                int resp=1, resp2=1;
                do{
                        resp2=1;
                    do{
                        resp=1;
                        String user="", pass="";
                        user=JOptionPane.showInputDialog("Username");
                        pass=JOptionPane.showInputDialog("Password");
                        for (int i = 0; i < personas.size(); i++) {
                            if(personas.get(i).getUsername().contains(user) && personas.get(i).getPassword().contains(pass)){
                                if(personas.get(i) instanceof Socio){
                                    //socio
                                    String op2="";
                                    while ( !op2.equals("s") ) {  
                                        op2=JOptionPane.showInputDialog(""
                                                + "a-Crear locales\n"
                                                + "b-Crear y asignar empleados\n"
                                                + "c-Agregar productos\n"
                                                + "s-salir");
                                        if(op2==null){
                                            op2="s";
                                        }
                                        if (op2.equals("a")) {
                                            String op3="";
                                            while ( !op3.equals("s") ) {  
                                                op3=JOptionPane.showInputDialog(""
                                                        + "a-Tienda\n"
                                                        + "b-Quiosco\n"
                                                        + "c-Local de comida\n"
                                                        + "s-salir");
                                                if(op3==null){
                                                    op3="s";
                                                }
                                                if (op3.equals("a")) {
                                                    int tamaño, piso;
                                                    String nombre;
                                                    nombre=JOptionPane.showInputDialog("nombre");
                                                    tamaño=Integer.parseInt(
                                                      JOptionPane.showInputDialog("tamaño")
                                                    );
                                                    piso=Integer.parseInt(
                                                      JOptionPane.showInputDialog("piso")
                                                    );
                                                    locales.add(new Tienda(tamaño, nombre, piso, null));
                                                    JOptionPane.showMessageDialog(null, "Tienda creada exitosamente");
                                                }
                                                if (op3.equals("b")) {
                                                    int piso, index;
                                                    String nombre, nombre_tienda;
                                                    nombre=JOptionPane.showInputDialog("nombre");
                                                    String s="Eliga el numero de la tienda de la cual desea el nombre\n";
                                                    for (Object t : locales) {
                                                        if (t instanceof Tienda) {
                                                           s+= ""+locales.indexOf(t)+"- "+t+"\n" ;
                                                        }
                                                    }
                                                    
                                                    index=Integer.parseInt(JOptionPane.showInputDialog(s));
                                                    nombre_tienda=locales.get(index).getNombre();
                                                    
                                                    piso=Integer.parseInt(
                                                      JOptionPane.showInputDialog("piso")
                                                    );
                                                    locales.add(new Quiosco(nombre_tienda, nombre, piso, null));
                                                    JOptionPane.showMessageDialog(null, "Quiosco cread exitosamente");
                                                }
                                                if (op3.equals("c")) {
                                                    int piso;
                                                    String nombre, nombre_tienda;
                                                    nombre=JOptionPane.showInputDialog("nombre");
                                                    piso=Integer.parseInt(
                                                      JOptionPane.showInputDialog("piso")
                                                    );
                                                    locales.add(new Local_Comida(null, nombre, piso, null));
                                                    JOptionPane.showMessageDialog(null, "Local de comida creado exitosamente");
                                                }
                                            }
                                        }
                                        if (op2.equals("b")) {
                                            String op3="";
                                            while ( !op3.equals("s") ) {  
                                                op3=JOptionPane.showInputDialog(""
                                                        + "a-Crear empleado\n"
                                                        + "b-Asignar empleado\n"
                                                        + "c-Eliminar empleado\n"
                                                        + "s-salir");
                                                if(op3==null){
                                                    op3="s";
                                                }
                                                if (op3.equals("a")) {
                                                    int id, vendidos=0;
                                                    double dinero;
                                                    String usuario, contra, correo, nombre, fecha, htrabajo;
                                                    nombre=JOptionPane.showInputDialog("nombre");
                                                    usuario=JOptionPane.showInputDialog("usuario");
                                                    contra=JOptionPane.showInputDialog("contrasenia");
                                                    correo=JOptionPane.showInputDialog("correo");
                                                    id=Integer.parseInt(
                                                      JOptionPane.showInputDialog("id")
                                                    );
                                                    fecha=JOptionPane.showInputDialog("fecha");
                                                    
                                                    personas.add(new Empleado(null, vendidos, usuario, contra, correo, nombre, id, fecha, true, false));
                                                    JOptionPane.showMessageDialog(null, "Empleado creado existosamente");
                                                }
                                                if (op3.equals("b")) {
                                                    int index, index2;
                                                    String s="Eliga el numero del empleado que quiere asignar\n";
                                                    for (Object t : personas) {
                                                        if (t instanceof Empleado) {
                                                           s+= ""+locales.indexOf(t)+"- "+t+"\n" ;
                                                        }
                                                    }
                                                    
                                                    index=Integer.parseInt(JOptionPane.showInputDialog(s));
                                                    String s2="Eliga el numero de la tienda adonde desea asignar el empliado\n";
                                                    for (Object t : locales) {
                                                        if (t instanceof Locales) {
                                                           s2+= ""+locales.indexOf(t)+"- "+t+"\n" ;
                                                        }
                                                    }
                                                    index2=Integer.parseInt(JOptionPane.showInputDialog(s2));
                                                    locales.get(index2).getEmpleados().add((Empleado)personas.get(index));
                                                    String horario=JOptionPane.showInputDialog("Horario");
                                                    ((Empleado)personas.get(index)).setHora_trabajo(horario);
                                                    JOptionPane.showMessageDialog(null, "Empleado asignado exitosamente");
                                                    
                                                }
                                                if (op3.equals("c")) {
                                                    System.out.println("eliminar empliado");
                                                }
                                            }
                                        }
                                        if (op2.equals("c")) {
                                            int index, index2;
                                            String s="Eliga el numero del local al que quiere agregar producto\n";
                                            for (Object t : locales) {
                                                if (t instanceof Locales) {
                                                   s+= ""+locales.indexOf(t)+"- "+t+"\n" ;
                                                }
                                            }

                                            index=Integer.parseInt(JOptionPane.showInputDialog(s));
                                        }
                                        if(locales.get(index)instance)
                                    }
                                    resp=1;
                                }else{
                                    if(personas.get(i).isEmpleado_cliente()){
                                        //cliente
                                        System.out.println("hola cliente");
                                        resp=1;
                                    }else{
                                        //empleado
                                        System.out.println("hola empleado");
                                        resp=1;
                                    }
                                }
                            }
                            else{
                                resp=3;
                            }
                        }
                    }while(resp==0);
                    if(resp==3){
                       JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                       resp2=0;
                    }
                }while(resp2==0);
            }
        }

    }
    
}
