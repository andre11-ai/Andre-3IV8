import java.util.Scanner;

class FigurasClasicas{

    /* 
    vamos a crear un programa que se encarge de realizar 
    un menu en el cual se pueda elegir entre calcular 
    el area o el perimetro de las soguientes figuras 
    
    triangulo
    cuadrado
    circulo

    Actualizacion, ahora quiero que se reputa todo el programa
    para volver a calcular otra area,

    como trabajo

    ustedes deben agregar las opciones del perimetro
    y dos figuras mas 

    rectangulo y pentagono 
    */
    public static void main(String[] args){
        //instancea de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base, altura, apotema, opcion;
        char letra;
        //vhar es el tipo de dato y letra es el nombre de la variable
        double resultado;
     do{
         //el cuerpo del programa
         System.out.println("Eliga la opcion deseada");
         System.out.println("1.-Calcular el area y perimetro de un cuadrado");
         System.out.println("2.- Calcular el area y perimetro de un triangulo");
         System.out.println("3.- Calcular el area y perimetro de un circulo");
         System.out.println("4.- Calcular el area y perimetro de un resctangulo");
         System.out.println("5.-Calcular el area y perimetro de un pentagono"); 

         //asignar la opcion

         opcion = entrada.nextInt();

         //segun, por que vamos a dar opciones a elegir 

         switch(opcion){
             case 1:
             //aqui es donde realizamos las operaciones
             System.out.println("Ingresa el valor del lado");
             base = entrada.nextInt();

             resultado = base*base;
             
             System.out.println("El area del cuadrado es de:" +resultado);

             System.out.println("Ingrese el valor del lado");
             base = entrada.nextInt();

             resultado = base*4;

             System.out.println("El perimetro de cuadrado es:"+resultado);


             break;

             case 2:
             System.out.println("ingresa el valor de la base");
             base = entrada.nextInt();

             System.out.println("Ingresa el valor de la altura");
             altura = entrada.nextInt();

             resultado =(base*altura)/2;
             System.out.println("El area del traingulo es de:" +resultado);

             System.out.println("Ingrese el valor del lado");
             base = entrada.nextInt();

             resultado = base*3;

             System.out.println("El perimetro de triangulo es:"+resultado);

            
             break;

             case 3:
             System.out.println("Ingresa el valor del radio");
             base = entrada.nextInt();

             resultado = 3.1416*base*base;

             System.out.println("El area del circulo es de:" +resultado);

             System.out.println("Ingrese el valor del radio");
             base = entrada.nextInt();

             resultado = base*2*3.1416;

             System.out.println("El perimetro de circulo es:"+resultado);



             break;

             case 4:
             System.out.println("ingresa el valor de la base");
             base = entrada.nextInt();

             System.out.println("Ingresa el valor de la altura");
             altura = entrada.nextInt();

             resultado = base*altura;

             System.out.println("El area del rectangulo es:" +resultado);

             System.out.println("Ingrese el valor del lado");
             base = entrada.nextInt();

             System.out.println("ingrese el valor de la altura");
             altura = entrada.nextInt();

             resultado = (base*2)+(altura*2);

             System.out.println("El perimetro de resctangulo es:"+resultado);

             break;

             case 5:
             System.out.println("ingresa el valor del lado");
             base = entrada.nextInt();

             System.out.println("Ingrese el valor de apotema");
             apotema = entrada.nextInt();

             resultado = (5*base*apotema)/2;

             System.out.println("el area de un pentagono es de:" +resultado);

             System.out.println("Ingrese el valor del lado");
             base = entrada.nextInt();

             resultado = base*5;

             System.out.println("El perimetro de pentagono es:"+resultado);

             break;

             default:
             System.out.println("Gracias por participar");
         
         
            }

            System.out.println("¿Deseas repetir el programa?, si lo desea escriba S");
            //recibir una respuesta de si o no 
            
            letra = entrada.next().charAt(0);

            //si utilizamos ''
            //si usamos string se usa""
            //char num =  1+1=11


        
        
        }while(letra == 's');
    }
}