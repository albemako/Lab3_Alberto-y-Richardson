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
        personas.add(new Personas("usuario", "contra", "usuario@yahoo.com", "usu", 199999, "fecha", false, true));
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
                                if(personas.get(i).isSocio()){
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
                                            System.out.println("crear local");
                                        }
                                        if (op2.equals("b")) {

                                        }
                                        if (op2.equals("c")) {

                                        }
                                    }
                                }else{
                                    if(personas.get(i).isEmpleado_cliente()){
                                        //cliente
                                        System.out.println("hola cliente");
                                    }else{
                                        //empleado
                                        System.out.println("hola empleado");
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
