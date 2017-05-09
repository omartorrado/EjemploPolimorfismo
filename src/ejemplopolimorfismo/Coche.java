/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author otorradomiguez
 */
public class Coche extends Vehiculo{

    private int numPuertas;

    public Coche(int numPuertas, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.numPuertas = numPuertas;
    }
    
    public int getNumPuertas(){
        return numPuertas;
    }
        
    @Override
    public float calcularPrecio() {        
        //return 95*super.getPotencia();
        /*No entiendo pq se hace esto en lugar de sobreescribir el metodo
        Usamos una lambda expresion para en cierta manera definir calcular precio
        y luego lo devolvemos...*/
        Icalculable ic=()->95*super.getPotencia();
        return ic.calcularPrecio();
    }

    @Override
    public void visualizar() {
        System.out.println("Coche -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Numero de puertas: "+numPuertas);
    }
    
    public String getVisualizar(){
        return "Coche -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Numero de puertas: "+numPuertas;
    }
    
    
}
