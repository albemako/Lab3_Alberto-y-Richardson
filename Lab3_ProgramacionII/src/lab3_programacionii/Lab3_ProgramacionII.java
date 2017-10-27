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
        ArrayList <Personas>personas=new ArrayList();
        
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
                                if(personas.getSocio){
                                    System.out.println("hola socio");
                                }else{
                                    if(personas.getEmpleado_cliente){
                                        System.out.println("hola cliente");
                                    }else{
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
