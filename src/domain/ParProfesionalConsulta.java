package domain;

import java.io.Serializable;

public class ParProfesionalConsulta implements Serializable {

    private Profesional profesional;
    private Consulta consulta;

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
