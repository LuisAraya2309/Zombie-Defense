
package zombiedefense;
public class Casilla extends Personaje{

    //Atributos
    private boolean obstaculizado;
    private boolean cubierto;
    private boolean esEntrada;
    private Items item;
    
    public Casilla(boolean obstaculizado, boolean cubierto, boolean esEntrada, int nivel, int salud, int ataque, int defensa, int rangoDeVision, int exp, Items loot) {
        super(nivel, salud, ataque, defensa, rangoDeVision, exp, loot);
        this.obstaculizado = obstaculizado;
        this.cubierto = cubierto;
        this.esEntrada = esEntrada;
        this.item = loot;
    }
    
    //Sets y Gets
    public boolean isObstaculizado() {
        return obstaculizado;
    }

    public void setObstaculizado(boolean obstaculizado) {
        this.obstaculizado = obstaculizado;
    }

    public boolean isCubierto() {
        return cubierto;
    }

    public void setCubierto(boolean cubierto) {
        this.cubierto = cubierto;
    }

    public boolean isEsEntrada() {
        return esEntrada;
    }

    public void setEsEntrada(boolean esEntrada) {
        this.esEntrada = esEntrada;
    }
     public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }
}