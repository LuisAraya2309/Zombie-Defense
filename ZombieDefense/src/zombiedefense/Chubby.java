
package zombiedefense;


public class Chubby extends Personaje{

    //Atributos
    public int mutacion;
    
    public Chubby(int mutacion, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp, Items loot) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp, loot);
        this.mutacion = mutacion;
    }
    
    public int getMutacion() {
        return mutacion;
    }

    public void setMutacion(int mutacion) {
        this.mutacion = mutacion;
    }  
}
