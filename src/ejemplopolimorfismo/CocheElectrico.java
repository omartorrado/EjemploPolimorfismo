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
public class CocheElectrico extends Coche{
    
    private int bateria;
    
    public CocheElectrico(int numPuertas, String matricula, String marca, int potencia, int bateria) {
        super(numPuertas, matricula, marca, potencia);
        this.bateria=bateria;
    }

    @Override
    public String getVisualizar() {
        return "Coche -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Numero de puertas: "+super.getNumPuertas()+", Bateria: "+bateria;
    }

    @Override
    public void visualizar() {
        System.out.println("Coche -> Matricula: "+super.getMatricula()+", Marca: "+super.getMarca()+", Potencia: "+super.getPotencia()+", Numero de puertas: "+super.getNumPuertas()+", Bateria: "+bateria);
    }

    @Override
    public float calcularPrecio() {
        return (95*super.getPotencia())-500;
    }
    
    
}
