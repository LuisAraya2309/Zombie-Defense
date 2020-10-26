
package zombiedefense;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
        
        /*SIMBOLOGIA
        -Tablero-
        X= CASILLA VACIA
        Z= SPAWNPOINT
        
        -Zombies-
        G = GHOUL
        L = LAKELURK
        C = CHUBBY
        
        -Personajes-
        A = ASESINO
        J = blindado
        E = Explorador
        
        -Base
        B = BASE
        
        */
    }
}
