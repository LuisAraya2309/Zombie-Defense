
package zombiedefense;


public class Ghoul extends Personaje{

    //Atributos
    private int pudricion;

    public Ghoul(int pudricion, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp, Items loot) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp, loot);
        this.pudricion = pudricion;
    }
   
    public int getPudricion() {
        return pudricion;
    }

 
    public void setPudricion(int pudricion) {
        this.pudricion = pudricion;
    } 
}
