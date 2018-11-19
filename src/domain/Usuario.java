package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;

public class Usuario extends Persona implements Serializable {

    private Icon avatar;
    private String nacionalidad;
    private String descripcion;
    //carnes lacteos frutas verduras otros
    private boolean[] preferencias = new boolean[5];
    private List<Preferencia> listaPreferencias;
    //salado dulce lacteos carnes rojas otros
    private boolean[] restricciones = new boolean[5];
    private List<AlimentoIngerido> alimentosIngeridos;
    private PlanAlimentacion planDeAlimentacion;
    private List<EstadoSanitario> historialEstadoSanitario;
    
    public Usuario(){
        this.historialEstadoSanitario = new ArrayList<>();
        this.listaPreferencias = new ArrayList<>();
        this.alimentosIngeridos = new ArrayList<>();
    }
    
    public void agregarEstadoSanitario(EstadoSanitario estadoSanitario){
        this.historialEstadoSanitario.add(estadoSanitario);
    }

    public Icon getAvatar() {
        return avatar;
    }

    public void setAvatar(Icon avatar) {
        this.avatar = avatar;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean[] getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(boolean[] preferencias) {
        this.preferencias = preferencias;
    }

    public List<Preferencia> getListaPreferencias() {
        return listaPreferencias;
    }

    public void setListaPreferencias(List<Preferencia> listaPreferencias) {
        this.listaPreferencias = listaPreferencias;
    }
    
    public boolean[] getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(boolean[] restricciones) {
        this.restricciones = restricciones;
    }

    public List<AlimentoIngerido> getAlimentosIngeridos() {
        return alimentosIngeridos;
    }

    public void setAlimentosIngeridos(List<AlimentoIngerido> alimentosIngeridos) {
        this.alimentosIngeridos = alimentosIngeridos;
    }

    public PlanAlimentacion getPlanDeAlimentacion() {
        return planDeAlimentacion;
    }

    public void setPlanDeAlimentacion(PlanAlimentacion planDeAlimentacion) {
        this.planDeAlimentacion = planDeAlimentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<EstadoSanitario> getHistorialIMC(){
        return this.historialEstadoSanitario;
    }
    
    @Override
    public String toString() {
        return this.getNombres() + " " + this.getApellidos();
    }
}
