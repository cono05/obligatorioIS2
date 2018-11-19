package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.*;
import javax.swing.Icon;

public class Profesional extends Persona implements Serializable {

    private Icon avatar;
    private String titulo;
    private String paisObtencionTitulo;
    private Date graduacion;
    private ArrayList<Consulta> listaConsultas = new ArrayList<>();
    private ArrayList<PlanAlimentacion> listaSolicitudesDePlanes = new ArrayList<>();
    
    public Icon getAvatar() {
        return avatar;
    }

    public void setAvatar(Icon avatar) {
        this.avatar = avatar;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPaisObtencionTitulo() {
        return paisObtencionTitulo;
    }

    public void setPaisObtencionTitulo(String paisObtencionTitulo) {
        this.paisObtencionTitulo = paisObtencionTitulo;
    }

    public Date getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(Date graduacion) {
        this.graduacion = graduacion;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    public List<PlanAlimentacion> getListaSolicitudesDePlanes() {
        return listaSolicitudesDePlanes;
    }

    public void setListaSolicitudesDePlanes(ArrayList<PlanAlimentacion> listaSolicitudesDePlanes) {
        this.listaSolicitudesDePlanes = listaSolicitudesDePlanes;
    }

    @Override
    public String toString() {
        return this.getNombres() + " " + this.getApellidos();
    }
}
