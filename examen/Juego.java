import java.util.*;

public class Juego {
    
    public static void Juego() {

    
        String entrada = "";
        Scanner sc = new Scanner(System.in);
        


        try{
            do { // Este bucle representa cada una de las partidas del ahorcado
                System.out.println("\nOtra Ronda mas uwu");
                Ahorcado ahorcado = new Ahorcado();
                do {    // Este bucle representa una partida concreta del ahorcado
                    System.out.printf("%n%s",ahorcado.getPalabraMostrar());
                    System.out.println("\nEscribe una letra de la palabra:");
                    entrada = sc.nextLine().toUpperCase();
                    System.out.printf("%nNúmero de intentos:%d",ahorcado.getNumIntentos());
                    if (entrada.equals("SALIR")){
                        break;
                    }
    
                    if (entrada.length()==1){   // Estamos jugando con una letra
                        ahorcado.intentar(entrada.charAt(0));
                    }
                    else{                       
                        if ((entrada.contains(Ahorcado.CAD_RESOLVER)) || 
                           ((entrada.contains(Ahorcado.CAD_ME_RINDO)))){
                            ahorcado.intentar(entrada);
                        }
                        else{
                            System.out.println("\nFormato de entrada incorrecto. Vuelva a intentarlo...");
                        }
                    }
                }while(!ahorcado.getFinPartida());
                
                System.out.println("\nJuego acabado");
                System.out.printf("%n%s",ahorcado.getPalabraMostrar());
                System.out.printf("%nPartidas ganadas:%d",Ahorcado.getPartidasGanadas());
                System.out.printf("%nPartidas perdidas:%d",Ahorcado.getPartidasPerdidas());
                

                System.out.print("");
                System.out.printf("para acabar el juego ponga Salir unu ");
                System.out.print("");
                System.out.printf("si no puede con la palabra escibir me doy uwu");
                
            }while(!entrada.equals("SALIR"));
            
           
            
        }catch(Exception e){
            System.out.println("ingrese solo letras");
            System.out.println("Error:"+ e.getMessage());
        
        }
    }

	
	}
