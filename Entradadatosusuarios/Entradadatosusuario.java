/* 
como hemos visto en anteriores sesiones  es posible captar 
la entrada de datos a partir de readLine(), que un metodo
de la consola a la entrada estandar de la computadora; 
pero que tal si quiero saber el tipo de datos que se trata 
introduccion, para ello necesito un objeto especial
*/

//libreria 
import java.util.Scanner; //solo lo que se ocupa 

import java.util.*; // mandando a llamar a toda la libreria 

class Entradadatosusuario{
    
    //metodo principal
    public static void main(String[] args){
        // a nuestr objeto o vamos acrear una instancea 
        
        Scanner entrada = new Scanner(System.in);

        //variables
        String nombre;
        int edad;
        float altura;

        System.out.println("Escribe tu nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Escribe tu edad:");
        edad = entrada.nextInt();

        System.out.println("Escribe tu estatura:");
        altura = entrada.nextFloat();

        System.out.println("Tu nombres es:" +nombre);
        System.out.println("Tu edad es:" +edad);
        System.out.println("Tu altura es:" +altura);

    }
}