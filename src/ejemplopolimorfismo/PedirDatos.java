/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class PedirDatos {
    
    public static int Int(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static String texto(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static boolean bool(String mensaje){
        boolean remolque;
        int respuesta =JOptionPane.showConfirmDialog(null, mensaje);
        if(respuesta==0){
            return true;
        }else {
            return false;
        }
    }
}
