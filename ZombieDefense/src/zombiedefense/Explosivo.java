
package zombiedefense;


public class Explosivo extends Items{

    //Atributos
    
    private int rangoExplosion;
    
    public Explosivo(int rangoExplosion, boolean equipado) {
        super(equipado);
        this.rangoExplosion = rangoExplosion;
    }
    
    public int getRangoExplosion() {
        return rangoExplosion;
    }

    public void setRangoExplosion(int rangoExplosion) {
        this.rangoExplosion = rangoExplosion;
    }
    
}
