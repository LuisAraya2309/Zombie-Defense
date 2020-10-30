
package zombiedefense;


public class Botiquin extends Items{

    //Atributos
    protected int curacion;
    
    public Botiquin(int curacion, boolean equipado) {
        super(equipado);
        this.curacion = curacion;
    }
    
    
    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    
}
