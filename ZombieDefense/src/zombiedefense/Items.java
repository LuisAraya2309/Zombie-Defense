
package zombiedefense;


public class Items {
    //Atributos
    protected boolean equipado;

    public Items(boolean equipado) {
        this.equipado = equipado;
    }
    
    
    public boolean isEquipado() {
        return equipado;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }
    
}
