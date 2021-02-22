import java.util.Arrays;
import java.util.Scanner;

public class Multijugador extends Juego {

    public static void Multijugador(){
    

        Scanner teclado = new Scanner(System.in);
        String jugarOtra="si"; 
        while(jugarOtra.equals("si")) {
            int puntuacion = 0;

            System.out.println("Jugador 1 introduzca la palabra deseada (sin numeros ni espacios)");
            String palabraInicial = teclado.nextLine();
            String palabraAux = palabraInicial;
            palabraInicial = "";

            for (int l = 0; l < palabraAux.length(); l++) {
                palabraInicial += "" + palabraAux.charAt(l) + " ";
            }

            for (int i = 0; i < 50; i++) { 
                System.out.println();
            }

            String palabraJuego = "";
            System.out.println("La palabra tiene de largo: ");

            for (int i = 0; i < palabraInicial.length() / 2; i++) { 
                palabraJuego += "_ ";
            }

            System.out.println(palabraJuego);

            String jugada;
            String[] palabraJugador2 = new String[palabraInicial.length()];
            for (int m = 0; m < palabraJuego.length(); m++) {
                palabraJugador2[m] = "" + palabraJuego.charAt(m);
            }
            int caracteresAnterior = palabraInicial.length() / 2; 
            int caracteresActual;


            while (puntuacion < 5) { 

                System.out.println("Numero de vidas restantes: " + (puntuacion - 7) + " de 7");

                System.out.println("Introduzca una letra: ");
                jugada = teclado.nextLine();

                while (jugada.length() != 1) { 
                    System.out.println("Introduzca SOLO una letra: ");
                    jugada = teclado.nextLine();
                }

                palabraJugador2 = comportamiento(jugada, palabraInicial, palabraJugador2); 

                for (int m = 0; m < palabraJugador2.length; m++) { 
                    System.out.print(palabraJugador2[m]);
                }
                System.out.println();

                palabraJuego = "";

                for (int x = 0; x < palabraInicial.length(); x++) {
                    palabraJuego += palabraJugador2[x];
                }

                caracteresActual = contarCaracteres(palabraJuego, '_');
                if (caracteresActual == 0) {
                    puntuacion = 6; 
                }

                if (caracteresActual == caracteresAnterior) { 
                    puntuacion++;
                }
                if (puntuacion == 5) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Ya valio");
                }
                if (puntuacion == 6) {
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                }
                pintarVidas(puntuacion);
                caracteresAnterior = caracteresActual;
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("GAME OVER");

            System.out.println("¿Desea jugar otra partida? Introduzca si para continuar");
            jugarOtra = (teclado.nextLine()).toLowerCase();
        }
    }
    public static String[] comportamiento (String jugada, String palabraInicial, String []palabraJugador2){
        

            for (int i = 0; i < palabraInicial.length(); i++) {
                if (palabraInicial.charAt(i) == jugada.charAt(0)) {
                    palabraJugador2[i] = jugada;
                }
            }
            return palabraJugador2;
    }


    public static void pintarVidas ( int puntuacion){

            switch (puntuacion) {
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
                    System.out.println("    Ganaste wiiiiii                 ");
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
    public static int contarCaracteres (String cadena,char caracter){
            int posicion, contador = 0;
           
            posicion = cadena.indexOf(caracter);
            while (posicion != -1) { 
                contador++;        
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
            return contador;
    }
}

