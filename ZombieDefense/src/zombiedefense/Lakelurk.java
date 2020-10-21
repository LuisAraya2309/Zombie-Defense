
package zombiedefense;


public class Lakelurk extends Zombie{

    //Atributos
    private int reencarnacion;
    
    public Lakelurk(int reencarnacion, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp);
        this.reencarnacion = reencarnacion;
    }
    
    public int getReencarnacion() {
        return reencarnacion;
    }

   
    public void setReencarnacion(int reencarnacion) {
        this.reencarnacion = reencarnacion;
    }

    
    
}
