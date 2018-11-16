/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author cono_
 */
public class EstadoSanitario {
    private double peso;
    private double altura;
    private double imc;
    private Date fecha;
    
    public EstadoSanitario(double peso, double altura, double imc, Date fecha){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Altura: " + this.altura + " Peso: " + this.peso + " IMC: " + this.imc;
    }
    
}
