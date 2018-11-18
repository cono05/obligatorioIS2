package domain;

import java.io.Serializable;
import java.util.Date;

public class AlimentoIngerido implements Serializable {

    private Alimento alimentoIngeridoUsuario;
    private Date fecha;

    public Alimento getAlimentoIngeridoUsuario() {
        return alimentoIngeridoUsuario;
    }

    public void setAlimentoIngeridoUsuario(Alimento alimento) {
        this.alimentoIngeridoUsuario = alimento;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.getAlimentoIngeridoUsuario().getNombre();
    }
}
