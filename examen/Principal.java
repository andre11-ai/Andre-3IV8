import java.util.*;

public class Principal{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int opcion;
        char letra;
        
        do{
         System.out.println("Hecho por Andre Eduardo Ayala Sanchez  3IV8");
         System.out.println("desea el juego deseado");
         System.out.println("1.- Multijugador");
         System.out.println("2.- Contra la maquina");
         

         opcion = entrada.nextInt();

         switch(opcion){
             case 1:
             Multijugador.Multijugador();

             break;

             case 2: 
             Juego.Juego();
             break;
         }


         System.out.println("si deseas repetir el programa escriba S y si no ponga no");
         letra = entrada.next().charAt(0);

        }while(letra == 's');



    }

    

   

   


    
}