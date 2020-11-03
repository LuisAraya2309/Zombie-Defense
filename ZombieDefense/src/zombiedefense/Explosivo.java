
package zombiedefense;


public class Explosivo extends Items{


    //Atributos
    
    private int rangoExplosion;
    private int daño;
    
    public Explosivo(int rangoExplosion,int daño, boolean equipado) {
        super(equipado);
        this.rangoExplosion = rangoExplosion;
        this.daño = daño;
    }
    
    public int getRangoExplosion() {
        return rangoExplosion;
    }

    public void setRangoExplosion(int rangoExplosion) {
        this.rangoExplosion = rangoExplosion;
    }
    
    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }
}
