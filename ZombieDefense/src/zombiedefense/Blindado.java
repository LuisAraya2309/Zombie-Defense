
package zombiedefense;

public class Blindado extends Personaje {

    

    //Atributos
    private int escudo;
    private boolean protegido;
 
    public Blindado(int escudo, boolean protegido, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp);
        this.escudo = escudo;
        this.protegido = protegido;
    }
    
    public int getEscudo() {
        return escudo;
    }

    
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    
    public boolean isProtegido() {
        return protegido;
    }

    
    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }
    
    
}
