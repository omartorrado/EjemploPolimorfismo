/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class EjemploPolimorfismo {

    static ColeccionVehiculos cv=new ColeccionVehiculos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo v1=new Coche(5,"1354BNT","Peugeot",1600);
        Vehiculo v2=new Camion(true,"5678LSD","Nissan",4000);    
        
        cv.añadirAColeccion(v1);
        cv.añadirAColeccion(v2);
        iniciarInterfaz();
        }

    public static void iniciarInterfaz(){
        JFrame marco = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        for(Vehiculo v:cv.listaVehiculos){
        JLabel display = new JLabel(v.getVisualizar());
        JLabel clase = new JLabel(v.getClass().getSimpleName());
        panel.add(display);
        panel.add(clase);
        }
        
        JButton añadirCoche = new JButton("Añadir Coche");
        JButton añadirCamion = new JButton("Añadir Camion");
        
        ActionListener al=((ActionEvent e)->{
            if(e.getSource().equals(añadirCoche)){
                cv.añadirAColeccion(new Coche(PedirDatos.Int("Indica el numero de puertas")
                        ,PedirDatos.texto("Indica la matricula"),PedirDatos.texto("Indica la marca")
                        ,PedirDatos.Int("Indica la potencia")));
            }else if(e.getSource().equals(añadirCamion)){
                cv.añadirAColeccion(new Camion(PedirDatos.bool("Tiene remolque"),"matricula","marca",1800));
            }
            iniciarInterfaz();
        });
        añadirCoche.addActionListener(al);
        añadirCamion.addActionListener(al);

        panel.add(añadirCoche);
        panel.add(añadirCamion);
        
        marco.setSize(800,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.add(panel);
        marco.setVisible(true);
    }
}
