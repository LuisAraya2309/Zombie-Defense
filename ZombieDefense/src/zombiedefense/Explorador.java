
package zombiedefense;


public class Explorador extends Personaje {

    
    //Atributos
    private Arma sniper;// = new Arma (4000,2,500,100);
    
    public Explorador(int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp, Items loot ,Arma sniper) {
            super(nivel, salud, ataque, defensa, rangoDeVision, exp, loot);
            this.sniper = sniper;
        }
    
    public Arma getSniper() {
        return sniper;
    }

    public void setSniper(Arma sniper) {
        this.sniper = sniper;
    }
}
