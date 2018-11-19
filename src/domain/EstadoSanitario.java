/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author cono_
 */
public class EstadoSanitario implements Serializable {
    private double peso;
    private double altura;
    private double imc;
    private Calendar fecha;
    
    public EstadoSanitario(double peso, double altura, double imc, Calendar fecha){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.fecha = fecha;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public double getIMC(){
        return this.imc;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    @Override
    public String toString() {
        return this.fecha.get(Calendar.DAY_OF_MONTH) + "/" + this.fecha.get(Calendar.MONTH)
                + "/" + this.fecha.get(Calendar.YEAR) + ": Altura: " + this.altura + 
                " Peso: " +this.peso +" IMC: " + this.imc;
    }
    
}
