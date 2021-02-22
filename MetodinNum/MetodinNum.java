/*el uso de metodos denntro de una clase, nos va a ayudar a organizar 
el codigo de forma que se puededividir en diferentes 
procesos que se encarguen de realiar de forma diferente acciones o funciones 
asi como en los ejemplos anteriores que hemos visto que el codigo 
empieza a crecer de forma exponencial llega un momento donde no se tiene 
orden en las diferentes operaciones al utilizar metodos que ayudan a la clase
a ser mas rapida al momento de ejecutar las tareas
*/
import java.util.Scanner;
public class MetodinNum{
    /*progrma que se encargue de saber cual es el numero mayor 
    y menor utilizando metodos para optimizar su operacion
    */
    //variables globales 
    int m;
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        //este es el cuerpo principal 
        //aqui es donde se ejecuta 
        //tengo que crear un objeto de la clase para asi mander a llamar a sus metodos 
        MetodinNum maymen = new MetodinNum();
        //mando a llamr a su metodo
        System.out.println("uwu");
        do{
            System.out.println("(umu)/");
            maymen.cargarValores();
            System.out.println("deseas repetir?");
            letra = entrada.nextLine();
            System.out.println("ono");
        }while(letra != "s");

    }

    //vamos a crear un metodo que tenga el menu de opciones 
    //el menu de operaciones 
    //palabra reservada vacio para metodos que no necesitan parametros
    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);
        //variables 
        int val1, val2, val3;
        int mayor, menor;

        System.out.println("Ingresar el primer numero a comparar");
        val1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero a comparar");
        val2 = entrada.nextInt();
        System.out.println("Ingresa el tercer numero a comparar");
        val3 = entrada.nextInt();

        //ahora vamos a mandar a llamar a un metodo que se encargue de conocer 
        //cual es el mayor y el menor envio los valores o los parametros 

        System.out.println("°^°");
        mayor = calcularMayor(val1, val2, val3);
        System.out.println("kok");
        menor = calcularmenor(val1, val2, val3);
           /*
        menu
        int opc;
        switch(opn){
            case 1:
                metodo1;
                break;
            case 2:
                metodo2;
                break;
            case 3:
                metodo3;
                double temp;
                conversiondetemp(temp)
                break
            }
        }
        
        public double conseiondetemp(double t){
            if
        }
        
        
        
        */ 



        //ahora vamos a imprimir el resultado
        System.out.println("El valor mayor es:" +mayor);
        System.out.println("el valor menor es:" +menor);
    }
    //recibir los parametros
    public int calcularMayor(int v1, int v2, int v3){
        //vamos a realizar las operacones para saber quien es el mas grande 
        //nesecitamos retornar el valor mas grande 
        //int m;
        if(v1>v2 && v1>v3){
            //asigno v1 a m
            m = v2;
        }else{
            if(v2>v3){
                m = v2;
            }
            else{
                m = v3;
            }
        }
        return m;
    }

    public int calcularmenor(int v1, int v2, int v3){
        //vamos a realizar las operaciones para saber quie es el mas chiquito
        //nesecitamos retornar el valor mas chiquitos
        //int m;
        if(v1<v2 && v1<v3){
            //asigno v1 a ,
            m = v1;
        }else{
            if(v2<v3){
                m = v1;
            }
            else{
                m = v3;
            }
        }
        return m;
    }
}