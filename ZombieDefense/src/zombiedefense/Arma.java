
package zombiedefense;


public class Arma extends Items{

    //Atributos
    private int daño;
    private int ruido;
    private int penetracion;
    private int precision;
    
    public Arma(int daño, int ruido, int penetracion, int precision, boolean equipado) {
        super(equipado);
        this.daño = daño;
        this.ruido = ruido;
        this.penetracion = penetracion;
        this.precision = precision;
    }
    
    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getRuido() {
        return ruido;
    }

    public void setRuido(int ruido) {
        this.ruido = ruido;
    }

    public int getPenetracion() {
        return penetracion;
    }

    public void setPenetracion(int penetracion) {
        this.penetracion = penetracion;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    

}
