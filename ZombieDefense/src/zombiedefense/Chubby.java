
package zombiedefense;


public class Chubby extends Zombie{

    //Atributos
    private int mutacion;
    
    public Chubby(int mutacion, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp);
        this.mutacion = mutacion;
    }
    
    public int getMutacion() {
        return mutacion;
    }

    public void setMutacion(int mutacion) {
        this.mutacion = mutacion;
    }
    
}
