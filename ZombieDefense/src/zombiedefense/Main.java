
package zombiedefense;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
        
        
    }
}
