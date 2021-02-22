import java.util.Scanner;

class ExamenPOO{

    
    public static void main(String[] args){
     
        Scanner entrada = new Scanner(System.in);

    
        int valorvital, id, nombre, fuerza, vida, ataqueprincipal, ataquesecundario,  opcion, patada, cabezaso;
        char letra;
        
        double resultado, defensa;
     do{
         System.out.println("Andre Eduardo Ayala Sanchez");
         System.out.println("Eliga la opcion deseada");
         System.out.println("1.-charmander");
         System.out.println("2.- bulbasaur ");
         System.out.println("3.- squartle");
         System.out.println("4.- batalla");
         System.out.println("5.- salir");
         

         

         opcion = entrada.nextInt();

         
         switch(opcion){
             

            case 1:

             do{

             System.out.println("desee que quiere saber de su pokemom");
              System.out.println("1.-energia vital");
             System.out.println("2.- atrivutos del pokemom");
              System.out.println("4.- salir");

              opcion = entrada.nextInt();
              switch(opcion){
                case 1:

               System.out.println("el valor vital de su pokemom es de 500");

               break;

               case 2:
               System.out.println("el id de este pokemon es de 001");
               System.out.println("el nombre de su pokemon es de charmander");
               System.out.println("su fuerza ");
               fuerza = 15550;
               System.out.println("su fuerza es de:" +fuerza);
               System.out.println("su defensa ");
               defensa = 200000;
               System.out.println("su defense es de:" +defensa);
               System.out.println("su primer ataque es un cabezaso critica");
               System.out.println("su ataque secundario es de una patado voladora");

               
               break;

               default:
               System.out.println("gracias por su preocupacion de su pokemon");


              }
              System.out.println("si desear repetir el menu del pokemon escriba r");
              letra = entrada.next().charAt(0);
             }while(letra == 'r');
             

             case 2:
              do{

             System.out.println("desee que quiere saber de su pokemom");
              System.out.println("1.-energia vital");
             System.out.println("2.- atrivutos del pokemom");
              System.out.println("4.- salir");

              opcion = entrada.nextInt();
              switch(opcion){
                case 1:

               System.out.println("el valor vital de su pokemom es de 550");

               break;

               case 2:
               System.out.println("el id de este pokemon es de 002");
               System.out.println("el nombre de su pokemon es de bulbasaur");
               System.out.println("su fuerza ");
               fuerza = 30000;
               System.out.println("su fuerza es de:" +fuerza);
               System.out.println("su defensa ");
               defensa = 15000;
               System.out.println("su defense es de:" +defensa);
               System.out.println("su primer ataque es un machetazo");
               System.out.println("su ataque secundario es de una latigazo");

               
               break;

               default:
               System.out.println("gracias por su preocupacion de su pokemon");


              }
              System.out.println("si desear repetir el menu del pokemon escriba r");
              letra = entrada.next().charAt(0);
             }while(letra == 'r');

             case 3:
             do{

                System.out.println("desee que quiere saber de su pokemom");
                 System.out.println("1.-energia vital");
                System.out.println("2.- atrivutos del pokemom");
                 System.out.println("4.- salir");
   
                 opcion = entrada.nextInt();
                 switch(opcion){
                   case 1:
   
                  System.out.println("el valor vital de su pokemom es de 450");
   
                  break;
   
                  case 2:
                  System.out.println("el id de este pokemon es de 003");
                  System.out.println("el nombre de su pokemon es de squartle");
                  System.out.println("su fuerza ");
                  fuerza = 40000;
                  System.out.println("su fuerza es de:" +fuerza);
                  System.out.println("su defensa ");
                  defensa = 10000;
                  System.out.println("su defense es de:" +defensa);
                  System.out.println("su primer ataque es un golpe critico");
                  System.out.println("su ataque secundario es golpe");
   
                  
                  break;
   
                  default:
                  System.out.println("gracias por su preocupacion de su pokemon");
   
   
                 }
                 System.out.println("si desear repetir el menu del pokemon escriba r");
                 letra = entrada.next().charAt(0);
                }while(letra == 'r');

                case 4:
                do{
                 System.out.println("Elige a tus pokemom para batallar");
                 System.out.println("1.squartle vs bulbasaur");
                 System.out.println("2.squartle vs charmander");
                 System.out.println("3.charmander vs bulbasaur");
                 System.out.println("4.salir de la batalla");

                    opcion = entrada.nextInt();
                    
                 switch(opcion){
                     case 1:

                     
                     defensa = entrada.nextInt();
                     if( defensa == 10000){
                        System.out.println("el primer encuentro neutro");
                    }
                    else if(defensa < 0){
                        System.out.println("ganadpr squartle");
                    }
                    else{
                        System.out.println("el ganador bulsasaur");
                    }
                    
                        
                 }
                 System.out.println("Si deseas repetir el programa escriba N");
                 letra = entrada.next().charAt(0);


                }while(letra == 'N');
                
             

             default:
             System.out.println("Gracias por participar");
         
         
            }

            
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba S");
         
            
            letra = entrada.next().charAt(0);

           

        
        
        }while(letra == 's');
    
    }
}
