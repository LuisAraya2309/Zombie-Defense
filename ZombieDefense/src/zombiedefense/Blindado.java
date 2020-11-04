
package zombiedefense;

public class Blindado extends Personaje {

    //Atributos
    private int escudo;
    private boolean protegido;
    private Arma shotgun;
 
    public Blindado(int escudo, boolean protegido, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp, Items loot, Arma shotgun) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp, loot);
        this.escudo = escudo;
        this.protegido = protegido;
        this.shotgun = shotgun;
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
    
     public Arma getShotgun() {
        return shotgun;
    }

    public void setShotgun(Arma shotgun) {
        this.shotgun = shotgun;
    }  
}
