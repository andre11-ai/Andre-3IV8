


public class Ahorcado extends Juego  {

    public static void Ahorcado(){

    }
    private final String[] palabras = {"CASA", "PARANGARICUTIRIMICUARO", "PROGRAMAS", "DINOSAURIO", "CARTON", "SEUDOCODIGO", "BATIZ", "ORTALIZA", "RAMMSTEIN",  "PARALELEPIPEDO", "FORMULAS"};
    private static int partidasGanadas;
    private static int partidasPerdidas;
   

   
   public final byte NUM_INTENTOS = 20;
   private byte numIntentos = 1;

   
   public static final String CAD_RESOLVER = "RESUELVO:";
  
   public static final String CAD_ME_RINDO = "ME DOY";

   private boolean adivinada = false;
   private boolean finPartida = false;
   
   private String palabraAdivinar = "";
   private StringBuffer palabraMostrar = new StringBuffer();

   
   

   public Ahorcado(){
       setPalabraAdivinar();
   }

   public String getPalabraMostrar() {
        return palabraMostrar.toString();
   }
   private void setPalabraAdivinar() {
       int indice = (int)(Math.random()*(palabras.length-1));
       
       this.palabraAdivinar = palabras[indice];
       setPalabraMostrar();
   }
   private void setPalabraMostrar(){
       palabraMostrar.append(palabraAdivinar.replaceAll("[a-zA-Z]","*"));
   }
   
   private void actualizarIntentos(){
       if (adivinada){
           partidasGanadas++;      
       }
       else{
           partidasPerdidas++;
       }
       
   }
   
   public boolean intentar(char letra){
       letra = String.valueOf(letra).toUpperCase().charAt(0);
       if (adivinada) return adivinada;
       if (numIntentos>NUM_INTENTOS) {
           finPartida = true;
           actualizarIntentos();
           return false;
       }

       for (int cont=0;cont < palabraMostrar.length();cont++){
           if (palabraAdivinar.charAt(cont)==letra){
               palabraMostrar.setCharAt(cont, letra);
           }
           
       }
       numIntentos++;

       if (palabraMostrar.indexOf("*")==-1){
           adivinada = true;
           finPartida = true;
           actualizarIntentos();
       }
       
       return adivinada;
   }
   
   public boolean intentar(String cadena){
       cadena = cadena.toUpperCase();
       String palabra="";
       palabraMostrar = new StringBuffer(palabraAdivinar); 

       if (cadena.contains(CAD_ME_RINDO)){
           numIntentos = NUM_INTENTOS+1;    
           finPartida = true;
       }

       if (adivinada) return adivinada; 
       if (numIntentos>NUM_INTENTOS) return false;

       numIntentos++;
       if (cadena.contains(CAD_RESOLVER)){
           palabra = cadena.substring(CAD_RESOLVER.length());
           if (palabra.equals(palabraAdivinar)){
               adivinada = true;
           }
           finPartida = true;
           
           actualizarIntentos();
         
       }
       
      
      

       
       return adivinada;
   }

    
   public boolean getFinPartida() {
        return finPartida;
    }

    public byte getNumIntentos() {
        return numIntentos;
    }
    public static int getPartidasGanadas() {
        return partidasGanadas;
    }

    public static int getPartidasPerdidas() {
        return partidasPerdidas;
    }

   
    public static void pintarVidas ( int puntuacion) {

        switch (puntuacion){
            case 1:
                System.out.println("      ______________________________                 ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                            ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                            ");
                System.out.println("      ||                                            ");
                System.out.println("  ____||____                                        ");

                break;
            case 2:
                System.out.println("      ______________________________                 ");
                System.out.println("      ||                            |                 ");
                System.out.println("      ||                            |                ");
                System.out.println("      ||                           _|_                 ");
                System.out.println("      ||                         _(___)_            ");
                System.out.println("      ||                         |     |              ");
                System.out.println("      ||                         |     |             ");
                System.out.println("      ||                         |_____|               ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                             ");
                System.out.println("      ||                                            ");
                System.out.println("      ||                                            ");
                System.out.println("  ____||____                                        ");

                break;
            case 3:
                System.out.println("      ______________________________                 ");
                System.out.println("      ||                            |                 ");
                System.out.println("      ||                            |                ");
                System.out.println("      ||                           _|_                 ");
                System.out.println("      ||                         _(___)_            ");
                System.out.println("      ||                         |     |              ");
                System.out.println("      ||                         |     |             ");
                System.out.println("      ||                         |_____|               ");
                System.out.println("      ||                            ||                 ");
                System.out.println("      ||                     ||||||||||||||||                ");
                System.out.println("      ||                            ||                ");
                System.out.println("      ||                            ||              ");
                System.out.println("      ||                          ||  ||          ");
                System.out.println("      ||                         ||    ||              ");
                System.out.println("      ||                        ||      ||              ");
                System.out.println("  ____||____                                          ");

                break;
            case 4:
                System.out.println("      ______________________________                 ");
                System.out.println("      ||                            |                 ");
                System.out.println("      ||                            |                ");
                System.out.println("      ||                           _|_                 ");
                System.out.println("      ||                         _(___)_            ");
                System.out.println("      ||                         | 0 0 |              ");
                System.out.println("      ||                         |  <  |             ");
                System.out.println("      ||                         |__0__|               ");
                System.out.println("      ||                            ||                 ");
                System.out.println("      ||                     ||||||||||||||||                ");
                System.out.println("      ||                            ||                ");
                System.out.println("      ||                            ||              ");
                System.out.println("      ||                          ||  ||          ");
                System.out.println("      ||                         ||    ||              ");
                System.out.println("      ||                        ||      ||              ");
                System.out.println("  ____||____                                          ");

                break;
            case 5:
                System.out.println("      ______________________________                 ");
                System.out.println("      ||                            |                 ");
                System.out.println("      ||                            |                ");
                System.out.println("      ||                           _|_                 ");
                System.out.println("      ||                         _(___)_            ");
                System.out.println("      ||                         | - - |              ");
                System.out.println("      ||                         |  <  |             ");
                System.out.println("      ||                         |__==_|               ");
                System.out.println("      ||                            ||                 ");
                System.out.println("      ||                          ||||||                ");
                System.out.println("      ||                        ||  ||  ||              ");
                System.out.println("      ||                       ||   ||    ||          ");
                System.out.println("      ||                          ||  ||          ");
                System.out.println("      ||                         ||    ||              ");
                System.out.println("      ||                        ||      ||              ");
                System.out.println("  ____||____                                          ");

                break;
            case 6:
                System.out.println("                                     ");
                System.out.println("                                      ");
                System.out.println("                                    ");
                System.out.println("                                    ");
                System.out.println("                _______             ");
                System.out.println("                | O O |              ");
                System.out.println("            ||  |  <  |    ||         ");
                System.out.println("             || |(==)_|  ||             ");
                System.out.println("               ||  ||  ||               ");
                System.out.println("                 ||||||                ");
                System.out.println("                   ||                ");
                System.out.println("                   ||              ");
                System.out.println("                 ||  ||              ");
                System.out.println("                ||    ||              ");
                System.out.println("               ||      ||              ");
                System.out.println("                                         ");

                break;
        }

}

    

}
    
 
    
