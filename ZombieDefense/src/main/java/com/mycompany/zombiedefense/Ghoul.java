
package com.mycompany.zombiedefense;


public class Ghoul extends Zombie{

    //Atributos
    private int pudricion;

    public Ghoul(int pudricion, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp);
        this.pudricion = pudricion;
    }
   
    public int getPudricion() {
        return pudricion;
    }

 
    public void setPudricion(int pudricion) {
        this.pudricion = pudricion;
    }
    
}
