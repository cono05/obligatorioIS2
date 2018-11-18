
package inicio;

import java.io.*;
import domain.*;
import ventanas.*;

public class Inicio {


    public static void main(String[] args) {

        // Sistema sist = new Sistema();
        Sistema sist = null;
        try {
            FileInputStream f = new FileInputStream("sistema.txt");
            // BufferedInputStream b = new BufferedInputStream(f);
            // ObjectInputStream s = new ObjectInputStream(b);
            ObjectInputStream s = new ObjectInputStream(f);
            sist = (Sistema) s.readObject();
            // s.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException a) {
        }
        if (sist == null) {
            sist = new Sistema();
        }
        
        // GUI ventanaPrincipal = new GUI();
        GUI ventanaPrincipal = new GUI(sist);
        ventanaPrincipal.setVisible(true);
    }
    
}
