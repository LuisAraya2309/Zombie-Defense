
package zombiedefense;


public class Potenciador extends Items{

    
    //Atributos
    private int nivel;
    private int daño;

    public Potenciador(int nivel,  int daño, boolean equipado) {
        super(equipado);
        this.nivel = nivel;
        this.daño = daño;
    }
    
    
    
    //Sets y Gets
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
}
