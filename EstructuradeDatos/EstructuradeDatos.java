import java.util.Scanner;

class EstructuradeDatos{ 
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int edad, opcion, numero, exp, digito, grado, galletas, leche, panques, donas;
        int base, altura, radio, factorial;
        char letra, socios;
        double binario, celsius, kelvine, rankine, uno, dos, tres,cuatro, monto, resultado, abajo, arriba;
        
        
        do{
            System.out.println("3IV8_Ayala_Sánchez_André_Eduardo");
            System.out.println("Elija la opcion deseada:");
            System.out.println("1.- Programa 1 ");
            System.out.println("2.- Programa 2 ");
            System.out.println("3.- Programa 3 ");
            System.out.println("4.- Programa 4 ");
            System.out.println("5.- Programa 5 ");
            System.out.println("6.- Programa 6 ");
            System.out.println("7.- Programa 7 ");
            System.out.println("8.- Programa 8 ");
            System.out.println("9.- Salir");

            opcion = entrada.nextInt();
            
            switch (opcion){
                
                case 1:

                System.out.println("Ingrese su edad");
                edad = entrada.nextInt();
                if (edad >= 65){
                    System.out.println("Tiene un abono de 40%");
                } else if (edad<= 21){
                    System.out.println("escriba s si su padres son socios");
                    socios = entrada.next().charAt(0);
                    if (socios == 's'){
                        System.out.println("tiene un abono de 45%");
                    } else if (socios != 's');
                    System.out.println("tiene un abono de 25%");
                }
                break;

                case 2:
                do{
                    System.out.println("introduce un numero");
                    numero = entrada.nextInt();
                }while(numero <0);
                exp = 0;
                binario = 0;
                while (numero != 0){
                    digito = numero % 2;
                    exp++;
                    numero = numero/2;
                }
                System.out.println("El numero binario es:" +numero);
                break;
                case 3:

                do{
                    System.out.println("Eliga la opcion deseada");
                    System.out.println("1-Fahrenheit a Celsius");
                    System.out.println("2-Fahrenheit a kelvine");
                    System.out.println("3-Fahrenheit a Rankine");
                    opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                        System.out.println("Ingrese el grado 1");
                        grado = entrada.nextInt();
                        celsius = (grado-32)/1.8;
                        System.out.println("Los grados en celsius son:" +celsius);
                        break;

                        case 2:
                        System.out.println("Ingrese el grado 2");
                        grado = entrada.nextInt();
                        kelvine = 5*(grado-32)/9+273.15;
                        System.out.println("Los grados en kelvine son:" + kelvine);
                        break;

                        case 3:
                        System.out.println("Ingrese el grado 3");
                        grado = entrada.nextInt();
                        rankine = grado+459.67;
                        System.out.println("Los grados en rankine son:" +rankine);
                        break;

                        default:
                        System.out.println("gracias por participar");
                    }
                    System.out.println("Si deseas repetir el programa escriba N");
                    letra = entrada.next().charAt(0);
                }while(letra == 'N');

                case 4:
                do{
                    System.out.println("pngo cuatro numeros");
                    uno = entrada.nextInt();
                    dos = entrada.nextInt();
                    tres = entrada.nextInt();
                    cuatro = entrada.nextInt();
                    if(uno == 0){
                        System.out.println("el numero neutro");
                    }
                    else if(uno < 0){
                        System.out.println("El numero es negativo 1");
                    }
                    else{
                        System.out.println("el numero es positivo");
                    }
                    
                    if(dos == 0){
                        System.out.println("el numero neutro");
                    }
                    else if(dos < 0){
                        System.out.println("el numero es negativo 2");
                    }
                    else{
                        System.out.println("el numero es positivo");
                    }

                    if(tres == 0){
                        System.out.println("el primer numero neutro");
                    }
                    else if(tres < 0){
                        System.out.println("el numero es negativo 3");
                    }
                    else{
                        System.out.println("el numero es poositivo");
                    }

                    if(cuatro == 0){
                        System.out.println("el primer numero neutro");
                    }
                    else if(cuatro < 0){
                        System.out.println("el numero es negativo");
                    }
                    else{
                        System.out.println("el numero es positivo");
                    }

                    System.out.println("");
                    System.out.println("si quiere regresar el programa escribir r");
                    letra = entrada.next().charAt(0);
                }while(letra == 'r');
                break;

                case 5:

                 System.out.println("tenemos los siguientes productos");
                 System.out.println("galletas-1$, leche-1$, panques-1$, donas-1$");
                 System.out.println("");
                 galletas = 1;
                 leche = 1;
                 panques = 1;
                 donas = 1;
                do{
                    System.out.println("cuantas galletas compro");
                    galletas = entrada.nextInt();
                }while(galletas < 0);
                    do{System.out.println("cuantas leches compro");
                    leche = entrada.nextInt();
                    }while(leche < 0);
                    do{System.out.println("cuantos panques compro");
                    panques = entrada.nextInt();
                    }while(panques < 0);
                    do{System.out.println("cuantas donas compro");
                    donas = entrada.nextInt();
                }while(donas < 0);
                    
                    monto = (galletas+leche+panques+donas);
                    System.out.println("Su monto es de: " + monto + " $. Gracias por su compra.");
                    System.out.println(" ");
                    System.out.println("Digite r si desea repetir el programa.");
                    letra = entrada.next().charAt(0);  
                   while (letra == 'r');
                 break;


                 case 6:

                 do{
                   System.out.println("eliga laopcion deseada");
                   System.out.println("1.- area y perimetro de un rectangulo");
                   System.out.println("2.- area y perimentro de un triangulo");
                   System.out.println("3.- volumenes de una esfera y un cilindro");
                   System.out.println("4.- salir");
                   opcion = entrada.nextInt();
                   switch(opcion){
                       case 1:
                       System.out.println("ingresa el valor de base");
                       base = entrada.nextInt();
                       System.out.println("ingresa el valor de altura");
                       altura = entrada.nextInt();
                       resultado = base*altura;
                       System.out.println("El area del rectangulo es:" +resultado);
                       System.out.println("ingresa el balor de la base");
                       base = entrada.nextInt();
                       System.out.println("ingresa el valor de la altura");
                       altura = entrada.nextInt();
                       resultado = (altura*2)+(base*2);
                       System.out.println("El perimetro del rectangulo es:" +resultado);
                       break;

                       case 2:
                       System.out.println("ingresa el volar de la base ");
                       base = entrada.nextInt();
                       System.out.println("ingresa el valor de la altura");
                       altura = entrada.nextInt();
                       resultado = (base*altura)/2;
                       System.out.println("El area de un triangulo es:" +resultado);
                       System.out.println("ingrese el vaor de la base");
                       base = entrada.nextInt();
                       resultado = base*3;
                       System.out.println("el perimetro del triangulo es de:" +resultado);
                       break;

                       case 3:
                       System.out.println("ingrese el radio");
                       radio = entrada.nextInt();
                       resultado = (radio*radio*radio)*3.1416*4/3;
                       System.out.println("El volumen de la esfera es de:" +resultado);
                       System.out.println("ingrese el valor del radio");
                       radio = entrada.nextInt();
                       System.out.println("ingresa el valor de la altura");
                       altura = entrada.nextInt();
                       resultado = (radio*radio)*altura*3.1416;
                       System.out.println("El volumne del cilindro es:" +resultado);
                       break;
                       default:
                       System.out.println("gracias por participar");

                    } 
                    System.out.println("si desas repetir el prgrama escriba r");
                    letra = entrada.next().charAt(0);
                 }while(letra == 'r');

                case 7:
               
                  do{
                   System.out.println("tabla de valores de unidades, decenas, centenas y mallares");
                   System.out.println("\tn\t\t\t");
                   System.out.println("\t1\t10\t100\t1000");
                   System.out.println("\t2\t20\t200\t2000");
                   System.out.println("\t3\t30\t300\t3000");
                   System.out.println("\t4\t40\t400\t4000");
                   System.out.println("\t5\t50\t500\t5000");
                   System.out.println("\t6\t60\t600\t6000");
                   System.out.println("\t7\t70\t700\t7000");
                   System.out.println("\t8\t80\t800\t8000");
                   System.out.println("\t9\t90\t900\t9000");
                   System.out.println("\t10\t100\t1000\t10000");
                   System.out.println("");
                   System.out.println("escribe r si deseas repetir el programa");
                   letra = entrada.next().charAt(0);
                  }while(letra == 'r');
                 break;



                 case 8:
                 do{
                 System.out.println("Escriba el numero del cual quiere sacar la factorial");
                 numero = entrada.nextInt();
                 if(numero!=1){
                    if(numero!=2){
                    do{
                    abajo = +2;
                    System.out.println("La factorial es: "+abajo);
                    
                    System.out.println(abajo);
                    
                    arriba = + 1;
                    System.out.println(arriba);
                    
                    
                 }while(numero+1 != arriba);
                 System.out.println("La factorial es: "+abajo);
               } else{System.out.println("La factorial es: 2");}
                 ;
               }
                 else {System.out.println("La factorial es: 1");}
                 
                 System.out.println("¿deseas repetir este programa?, si lo desea escriba s");
              
               letra = entrada.next().charAt(0);
       
               
       
               }while(letra == 's'); 
               break;
                 
                 default:
                
                
                
               }
               System.out.println("¿deseas volver al menu uwu?, si lo desea escriba s");
              
               letra = entrada.next().charAt(0);
       
              
       
           }while(letra == 's'); 
       }
    }
 
       
