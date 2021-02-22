import java.util.ArrayList;

public class Baraja {
   
   private ArrayList<Carta> mazo;
   public Baraja () {
      this.mazo = new ArrayList<>();
   }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }
    
    public void GenerarMazo(){
        int uwu=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 15; j++) {
        mazo.add (new Carta (uwu++, i, j));
            }
        }
        
    }
    public static void main (String[]args) {
        Baraja ono = new Baraja ();
        ono.GenerarMazo();
        System.out.println(ono.getMazo().toString()); 
        
    }
    
        }