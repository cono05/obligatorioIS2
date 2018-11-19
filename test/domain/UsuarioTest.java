package domain;

import domain.Usuario;
import domain.PlanAlimentacion;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import domain.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;

public class UsuarioTest {

    private Sistema unSistema;

    public UsuarioTest() {
    }

    @Before
    public void setUp() {
        unSistema = new Sistema();
    }

    @Test
    public void testRegistrarUsuarioNombreVacio() {
        int tamanoInicial = unSistema.getListaUsuarios().size();
        int resultadoEsperado = tamanoInicial;

        String nombres = "";
        String apellidos = "Rodríguez";
        String nacionalidad = "Uruguay";
        String descripcion = "Intolerante a la lactosa";
        Date nacimiento = new Date();
        boolean[] preferencias = new boolean[5];
        ArrayList<Preferencia> listaPreferencias = new ArrayList<Preferencia>();
        boolean[] restricciones = new boolean[5];

        unSistema.registrarUsuario(nombres, apellidos, nacionalidad, listaPreferencias, restricciones, nacimiento, descripcion, null);

        int resutladoObtenido = unSistema.getListaUsuarios().size();

        assertEquals(resultadoEsperado, resutladoObtenido);

    }

    @Test
    public void testRegistrarUsuarioApellidoVacio() {
        int tamanoInicial = unSistema.getListaUsuarios().size();
        int resultadoEsperado = tamanoInicial;

        String nombres = "Emanuel";
        String apellidos = "";
        String nacionalidad = "Uruguay";
        String descripcion = "Intolerante a la lactosa";
        Date nacimiento = new Date();      
        List<Preferencia> listaPreferencias = new ArrayList<>();
        boolean[] restricciones = new boolean[5];

        unSistema.registrarUsuario(nombres, apellidos, nacionalidad, listaPreferencias, restricciones, nacimiento, descripcion, null);

        int resutladoObtenido = unSistema.getListaUsuarios().size();

        assertEquals(resultadoEsperado, resutladoObtenido);

    }

    @Test
    public void testRegistrarUsuarioNacionalidadVacia() {
        int tamanoInicial = unSistema.getListaUsuarios().size();
        int resultadoEsperado = tamanoInicial;

        String nombres = "Emanuel";
        String apellidos = "Lopez";
        String nacionalidad = "";
        String descripcion = "Intolerante a la lactosa";
        Date nacimiento = new Date();        
        List<Preferencia> listaPreferencias = new ArrayList<>();
        boolean[] restricciones = new boolean[5];

        unSistema.registrarUsuario(nombres, apellidos, nacionalidad, listaPreferencias, restricciones, nacimiento, descripcion, null);

        int resutladoObtenido = unSistema.getListaUsuarios().size();

        assertEquals(resultadoEsperado, resutladoObtenido);

    }

    @Test
    public void testRegistrarUsuarioDescripcionVacia() {
        int tamanoInicial = unSistema.getListaUsuarios().size();
        int resultadoEsperado = tamanoInicial + 1;

        String nombres = "Emanuel";
        String apellidos = "Lopez";
        String nacionalidad = "Uruguay";
        String descripcion = "";
        Date nacimiento = new Date();        
        List<Preferencia> listaPreferencias = new ArrayList<>();
        boolean[] restricciones = new boolean[5];
        unSistema.registrarUsuario(nombres, apellidos, nacionalidad, listaPreferencias, restricciones, nacimiento, descripcion, null);

        int resutladoObtenido = unSistema.getListaUsuarios().size();

        assertEquals(resultadoEsperado, resutladoObtenido);

    }

    @Test
    public void testRegistrarUsuarioCorrecto() {
        int tamanoInicial = unSistema.getListaUsuarios().size();
        int resultadoEsperado = tamanoInicial + 1;

        String nombres = "Emanuel";
        String apellidos = "Lopez";
        String nacionalidad = "Uruguay";
        String descripcion = "Intolerante a la lactosa";
        Date nacimiento = new Date();        
        List<Preferencia> listaPreferencias = new ArrayList<>();
        boolean[] restricciones = new boolean[5];

        unSistema.registrarUsuario(nombres, apellidos, nacionalidad, listaPreferencias, restricciones, nacimiento, descripcion, null);

        int resutladoObtenido = unSistema.getListaUsuarios().size();

        assertEquals(resultadoEsperado, resutladoObtenido);

    }

    @Test
    public void testGetPlanDeAlimentacion() {
        Usuario unUsuario = new Usuario();
        PlanAlimentacion unPlan = new PlanAlimentacion();
        unPlan.setEstado(true);
        unUsuario.setPlanDeAlimentacion(unPlan);
        assertEquals(unPlan, unUsuario.getPlanDeAlimentacion());

    }

    @Test
    public void testGetNacionalidad() {
        Usuario unUsuario = new Usuario();
        String nacionalidad = "Argentina";
        unUsuario.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, unUsuario.getNacionalidad());
    }

    @Test
    public void testGetPreferencias() {
        Usuario unUsuario = new Usuario();
        boolean[] preferencias = new boolean[5];
        preferencias[1] = true;
        preferencias[4] = true;
        unUsuario.setPreferencias(preferencias);
        assertArrayEquals(preferencias, unUsuario.getPreferencias());
    }

    @Test
    public void testGetListaPreferencias() {
        Usuario unUsuario = new Usuario();
        ArrayList<Preferencia> listaPreferencias = new ArrayList<Preferencia>();
        Preferencia uno = new Preferencia();
        uno.setNombre("Pan");
        listaPreferencias.add(uno);
        Preferencia dos = new Preferencia();
        dos.setNombre("Pan");
        listaPreferencias.add(dos);
        unUsuario.setListaPreferencias(listaPreferencias);
        assertEquals(listaPreferencias, unUsuario.getListaPreferencias());
    }
    
    @Test
    public void testGetRestricciones() {
        Usuario unUsuario = new Usuario();
        boolean[] restricciones = new boolean[5];
        restricciones[3] = true;
        restricciones[4] = true;
        unUsuario.setRestricciones(restricciones);
        assertArrayEquals(restricciones, unUsuario.getRestricciones());
    }

    @Test
    public void testGetDescripcion() {
        Usuario unUsuario = new Usuario();
        String descripcion = "Intolerante a la lactosa";
        unUsuario.setDescripcion(descripcion);
        assertEquals(descripcion, unUsuario.getDescripcion());
    }

    @Test
    public void testGetAvatar(){
        Usuario unUsuario = new Usuario();
        Icon avatar = null;
        unUsuario.setAvatar(avatar);
        assertEquals(avatar, unUsuario.getAvatar());
    }
    @Test
    public void testToString() {
        Usuario unUsuario = new Usuario();
        String nombre = "Maria Elena";
        String apellido = "Walsh";
        unUsuario.setNombres(nombre);
        unUsuario.setApellidos(apellido);
        String resultadoEsperado = nombre + " " + apellido;
        assertEquals(resultadoEsperado, unUsuario.toString());
    }
    
    @Test
    public void testAgregarEstadoSanitario(){
        Usuario usuario = new Usuario();
        double peso = 80;
        double altura = 170;
        double imc = peso/(altura*altura);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance(); // Obtiene una instancia de Calendar
        calendar.setTime(date);
        EstadoSanitario estado = new EstadoSanitario(peso, altura, imc , calendar);
        usuario.agregarEstadoSanitario(estado);
        assertTrue(usuario.getHistorialIMC().size()==1);
        
    }
}