/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cono_
 */
public class EstadoSanitarioTest {
    
    public EstadoSanitarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class EstadoSanitario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        double peso = 80;
        double altura = 170;
        double imc = peso/(altura*altura);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance(); // Obtiene una instancia de Calendar
        calendar.setTime(date);
        EstadoSanitario instance = new EstadoSanitario(peso, altura, imc , calendar) ;
        String expResult = instance.getFecha().get(Calendar.DAY_OF_MONTH) + "/" + instance.getFecha().get(Calendar.MONTH)
                + "/" + instance.getFecha().get(Calendar.YEAR) + ": Altura: " + instance.getAltura() + 
                " Peso: " +instance.getPeso()+" IMC: " + instance.getIMC();;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
