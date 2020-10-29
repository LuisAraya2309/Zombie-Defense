
package zombiedefense;


public class Asesino extends Personaje {

    //Atributos
    private Arma arco;// = new Arma(1000, 0,200,100);

    public Asesino(int nivel, int salud,int ataque,int defensa, int rangoDeVision, int exp,Arma arco) {
        super(nivel, salud,ataque,defensa, rangoDeVision, exp);
        this.arco = arco;
    }
    
    public Arma getArco() {
        return arco;
    }

    public void setArco(Arma arco) {
        this.arco = arco;
    }

  
    
}
