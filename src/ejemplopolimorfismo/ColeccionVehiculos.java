/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author otorradomiguez
 */
public class ColeccionVehiculos {
    List <Vehiculo> listaVehiculos;

    public ColeccionVehiculos(){
        //Como ya declaramos el tipo en lista <Vehiculo>, al instanciar el arrayList
        //simplemente le marcamos que tiene un tipo concreto con <>
        listaVehiculos=new ArrayList<>();
    }
    
    //Al añadir vehiculos, el metodo podrá recibir tanto coches como camiones
    //No podria recibir un vehiculo pq al ser clase abstracta no se puede instanciar
    public void añadirAColeccion(Vehiculo v){
        listaVehiculos.add(v);
    }
    
    //Hacemos un for each para que nos muestre el precio de cada vehiculo
    public void verPrecio(){
        for(Vehiculo v:listaVehiculos){
            System.out.print(" Precio: "+v.calcularPrecio());
            v.visualizar();
            //con v.getClass() nos da el nombre de la clase y el paquete -> ejemplopolimorfismo.Coche
            //con v.getClass().getSimpleName() nos daria el nombre de la clase -> Coche
            System.out.println(v.getClass());
        }
    }
    
    public void mostrar(){
        //La funcion iterator esta en todas las colecciones de java
        Iterator it=listaVehiculos.iterator();
        while(it.hasNext()){
            //Lo casteamos como vehiculo para que nos permita acceder a los metodos
            //sino lo consideraria un objeto y solo dejaria usar los metodos de objeto
            Vehiculo v=(Vehiculo)it.next();
            v.visualizar();
        }
    }

}
