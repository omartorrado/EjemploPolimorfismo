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
public class Camion extends Vehiculo{
    
    private boolean remolque;

    public Camion(boolean remolque, String matricula, String marca, int potencia) {
        super(matricula, marca, potencia);
        this.remolque = remolque;
    }   
    
    @Override
    public float calcularPrecio(){
        /*
        if(remolque){
            return super.getPotencia()*120+10000;
        }else{
            return super.getPotencia()*120;
        }
        */
        //En una linea (Esto es un if-else compacto:  condicion?codigo_si_es_true:codigo_si_es_false;)
        return remolque?super.getPotencia()*120+10000:super.getPotencia()*120;
    }

    @Override
    public void visualizar() {
        System.out.println("Camion -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Remolque: "+remolque);
    }
    
    public String getVisualizar(){
        return "Camion -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Remolque: "+remolque;
    }
}
