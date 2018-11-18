package domain;

import java.io.Serializable;

public class Enums implements Serializable {
    public enum NutrientesPrincipales {
        PROTEINAS, CARBOHIDRATOS, VITAMINAS, MINERALES, ANTIOXIDANTES
    }
    
    public enum MotivoConsulta{
        ALIMENTOSINGERIDOS, ALIMENTOSINGERIR, OTROS
    }
    
}
