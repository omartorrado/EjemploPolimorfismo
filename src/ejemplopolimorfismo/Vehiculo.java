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
public abstract class Vehiculo {
    
    private String matricula;
    private String marca;
    private int potencia;

    public Vehiculo(String matricula, String marca, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
        
    public abstract float calcularPrecio();
    
    public void visualizar(){
        System.out.println("Vehiculo -> Matricula: "+matricula+", Marca: "+marca+", Potencia: "+potencia);
    }
    
    public abstract String getVisualizar();
}
