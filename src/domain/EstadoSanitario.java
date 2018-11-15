/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author cono_
 */
public class EstadoSanitario {
    private int peso;
    private int altura;
    private float imc;
    
    public EstadoSanitario(int peso, int altura, float imc){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }
    
    @Override
    public String toString() {
        return "Altura: " + this.altura + " Peso: " + this.peso + " IMC: " + this.imc;
    }
    
}
