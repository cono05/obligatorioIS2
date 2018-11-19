package domain;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class PreferenciaTest {

    private Preferencia unaPreferencia;
    private ArrayList<Preferencia> listaPreferencias;
    
    public PreferenciaTest() {
    }

    @Before
    public void setUp() {
        unaPreferencia = new Preferencia();
    }

    @Test
    public void testRegistrarPreferenciaVacia() {
        String nombre = "";
        unaPreferencia.setNombre(nombre);
        assertEquals("", unaPreferencia.getNombre());
    }

    @Test
    public void testRegistrarPreferenciaCorrecta() {
        String nombre = "Pan";
        unaPreferencia.setNombre(nombre);
        assertEquals(nombre, unaPreferencia.getNombre());
    }

    @Test
    public void testGetNombre() {
        Preferencia p = new Preferencia();
        String nombre = "Miel";
        p.setNombre(nombre);
        assertEquals(nombre, p.getNombre());
    }

    @Test
    public void testToStrig(){
        String nombre = "Pan";
        unaPreferencia.setNombre(nombre);
        assertEquals(unaPreferencia.toString(), "Pan");
    }
}