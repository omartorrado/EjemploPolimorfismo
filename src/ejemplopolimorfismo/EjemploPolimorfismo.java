/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
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
        JLabel clase = new JLabel("Clase : "+v.getClass().getSimpleName()+". Precio: "+v.calcularPrecio());
        display.setAlignmentX(0.5f);
        clase.setAlignmentX(0.5f);
        
        panel.add(display);
        panel.add(clase);
        }
        
        JButton añadirCoche = new JButton("Añadir Coche");
        JButton añadirCamion = new JButton("Añadir Camion");
        JButton añadirCocheElectrico = new JButton("Añadir coche eléctrico");
        
        ActionListener al=((ActionEvent e)->{
            if(e.getSource().equals(añadirCoche)){
                cv.añadirAColeccion(new Coche(PedirDatos.Int("Indica el numero de puertas")
                        ,PedirDatos.texto("Indica la matricula")
                        ,PedirDatos.texto("Indica la marca")
                        ,PedirDatos.Int("Indica la potencia")));
            }else if(e.getSource().equals(añadirCamion)){
                cv.añadirAColeccion(new Camion(PedirDatos.bool("Tiene remolque")
                        ,PedirDatos.texto("Indica la matricula")
                        ,PedirDatos.texto("Indica la marca")
                        ,PedirDatos.Int("Indica la potencia")));
            }else if(e.getSource().equals(añadirCocheElectrico)){
                cv.añadirAColeccion(new CocheElectrico(PedirDatos.Int("Indica el numero de puertas")
                        ,PedirDatos.texto("Indica la matricula")
                        ,PedirDatos.texto("Indica la marca")
                        ,PedirDatos.Int("Indica la potencia")
                        ,PedirDatos.Int("Indica la potencia de la bateria")));
            }
            iniciarInterfaz();            
        });
        añadirCoche.addActionListener(al);
        añadirCoche.setAlignmentX(0.5f);
        añadirCamion.addActionListener(al);
        añadirCamion.setAlignmentX(0.5f);
        añadirCocheElectrico.addActionListener(al);
        añadirCocheElectrico.setAlignmentX(0.5f);

        panel.add(añadirCoche);
        panel.add(añadirCamion);
        panel.add(añadirCocheElectrico);
        
        marco.setSize(800,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.add(panel);
        marco.setVisible(true);
    }
}
