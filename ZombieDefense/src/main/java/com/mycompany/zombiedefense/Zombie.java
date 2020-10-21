
package com.mycompany.zombiedefense;

public class Zombie {

    

    //Atributos
    protected int nivel;
    protected int salud;
    protected int ataque;
    protected int defensa;
    protected int rangoDeVision;
    protected int exp;
    public Zombie(int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp) {
        this.nivel = nivel;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.rangoDeVision = rangoDeVision;
        this.exp = exp;
    }
    
    public int getNivel() {
        return nivel;
    }

    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

   
    public int getSalud() {
        return salud;
    }

   
    public void setSalud(int salud) {
        this.salud = salud;
    }

 
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

  
    public int getDefensa() {
        return defensa;
    }

  
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

   
    public int getRangoDeVision() {
        return rangoDeVision;
    }

   
    public void setRangoDeVision(int rangoDeVision) {
        this.rangoDeVision = rangoDeVision;
    }

    
    public int getExp() {
        return exp;
    }

    
    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
    
}
