import java.util.Scanner;

class SumadeNumeros{

    public static void main(String[] args){
        /*vamos a crear u programa que se encarge de sumar 2 numeros 
        positivos */

        Scanner entrada = new Scanner(System.in);

        //variables 

        int num1, num2;
        int resultado=0;
        do{ 
            System.out.println("Ingresa el primer valor");

            num1 = entrada.nextInt();
            while(num1<0){
            
             System.out.println("introduzca un valor positivo");
             num1 = entrada.nextInt();
            }
            /* System.out.println("Ingrese el segundo numero: ");
            num2 =entrada.nextInt();

            while(nu,2<0){
                System.out.println("Introduza un valor positivo")
                num2 = entrada.nextInt();
            }
            */
            resultado = resultado + num1;


        } while(num1 != 0);

        System.out.println("La suma es de:" +resultado);
            
    }
}