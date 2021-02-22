import java.util.*;
public class Arregloss{
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        char letra;
        int suma;
        Scanner entrada = new Scanner(System.in);
        Arregloss maymen = new Arregloss();
        System.out.println("Que programa deseas probar");
        System.out.println("1.-programa 1");
        System.out.println("2.- programa 2");
        System.out.println("3.-programa 3");
        System.out.println("4.- programa 4");
        do{maymen.menu();
            System.out.println("deseas repetir si es asi ponga s");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
    }

    public void menu(){
        int opcion;
        char letra;
        int [] Arreglos = new int [10];
        Arregloss maymen = new Arregloss();
        System.out.println("programas");
        System.out.println("1.- programa 1");
        System.out.println("2.- programa 2");
        System.out.println("3.. pragrama 3");
        System.out.println("4.- programa 4");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
            do{
                Arreglos = programa1 (Arreglos);
                maymen.promedioPos(Arreglos);
                maymen.promedioNeg(Arreglos);
                System.out.println("si desea repetir persine s");
                letra = entrada.next().charAt(0);
            }while (letra == 's');
            break;

            case 2:
            do{
              Arreglos = programa2(Arreglos);
              maymen.promemediopar(Arreglos);
              System.out.println("si desear repetir presiones s");
              letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;

            case 3:
            do{
               Arreglos = programa3(Arreglos);
               maymen.promediocalificaciones(Arreglos);
               maymen.calificacionaltaybaja(Arreglos);
               maymen.numdecalificacionaltaalpromedio(Arreglos, opcion);
               maymen.resultados(Arreglos);
               System.out.println("si deseas repetir persiones s");
               letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;
            case 4:
            do{
                maymen.matriz();
                System.out.println("si deseas repetir presionoe");
                letra = entrada.next().charAt(0);
            }while(letra == 's');
            break;
        }
    }



    public int[] programa1(int[] arreglos) {
        System.out.println("\n*LLENADO DEL ARREGLO*\nIngrese 10 numeros al arreglo.");
        for (int i=0; i<arreglos.length;i++){
            System.out.print("Valor de la posicion "+i+": ");
            arreglos [i] = entrada.nextInt();
        }
        return arreglos;
    }

    public void promedioPos(int[]arreglos){
        float p=0;
        float elementos = 0;
        for (int i=0; i<arreglos.length;i++){
            if (arreglos[i]>0){
                p += arreglos[i];
                elementos ++;
            } 
        }
        System.out.println("El promedio de los positivos es: "+p/elementos);
    }

    public void promedioNeg(int[]arreglos){
        float n=0;
        float elementos = 0;
        for (int i=0; i<arreglos.length;i++){
            if (arreglos[i]<0){
                n += arreglos[i];
                elementos ++;
            } 
        }
        System.out.println("El promedio de los negativos es: "+(n/elementos));
    }


    public int[] programa2(int[] Arreglos){
       
        System.out.println("\n*LLENADO DEL ARREGLO*\nIngrese 10 numeros al arreglo.");
        for (int i=0; i<Arreglos.length;i++){
            System.out.print("Valor de la posicion "+i+": ");
            Arreglos [i] = entrada.nextInt();
        }
        return Arreglos;
    }
  
    public void promemediopar(int[] Arreglos){
        int i;
        int[] numeros = new int[10];
        double media = 0;

        
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ 
                media = media + numeros[i]; 
            }
        }
      
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);              
    }
    


    public int[] programa3(int[] Arreglos){
       
        System.out.println("\n*LLENADO DEL ARREGLO*\nIngrese 10 numeros al arreglo.");
        for (int i=0; i<Arreglos.length;i++){
            System.out.print("Valor de la posicion "+i+": ");
            Arreglos [i] = entrada.nextInt();
        }
        return Arreglos;
    }
  public void promediocalificaciones(int[] Arreglos){
      int i, nota;
      double suma=0, media;
      
    for (i = 0; i < Arreglos.length; i++) {
        suma =suma + Arreglos[i];
    }

        // Calcular la media
       media = suma / Arreglos.length;
       System.out.println("EL promedio es de:" +media);
  }

  public void calificacionaltaybaja(int[] Arreglos){
      int mayor, menor;
     mayor = menor = Arreglos [0];
   
     for (int i = 0; i < Arreglos.length; i++) {
          if(Arreglos [i] > mayor) {
            mayor = Arreglos[i];
        
          } else if(Arreglos[i]<menor) {
            menor = Arreglos[i];
         }
         System.out.println("El mayor valor es: "+mayor);
         System.out.println("El menor valor es: "+menor);
     }    

    }
    public void resultados(int[] arreglos) {
        int apr = 0;
        int repr = 0;
        for (int i = 0; i < arreglos.length; i++) {
            if (arreglos[i] > 6) {
                apr++;
            } else if (arreglos[i] < 6) {
                repr ++;
            }
        }
        System.out.println("Cantidad de alumnos reprobados: "+repr);
        System.out.println("Cantidad de alumnos aprobados: "+apr);
    }

      
    
        public void numdecalificacionaltaalpromedio(int[] Arreglos, float media){
            int califs=0;
            
        
            for (int i=0; i<Arreglos.length;i++){
                if (Arreglos[i]>media){
                    califs ++;
                }
            }
            System.out.println("El numero de calificaciones superiores al promedio es: "+califs);
        }
        
        






        public void matriz(){

            Scanner entrada = new Scanner (System.in);
    
            int matriza[][] = new int [3][3];
            int matrizb[][] = new int [3][3];
            int matrizs[][] = new int [3][3];
            int i, j;
            System.out.println("Datos de la matriz A.");
            for (i = 0; i <= 2; i++){
                for (j = 0; j <= 2; j++){
                    System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                    matriza [i][j] = entrada.nextInt();
                }
            }
            System.out.println("\nDatos de la matriz B.");
            for (i = 0; i <= 2; i++){
                for (j = 0; j <= 2; j++){
                    System.out.print("Escribir el valor de [" + i + "] [" + j + "]: ");
                    matrizb[i][j] = entrada.nextInt();
                }
            }
            for (i = 0; i <= 2; i++){
                for (j = 0; j <= 2; j++){
                     matrizs [i][j] = matriza[i][j] + matrizb[i][j];
                }
            }
            System.out.println("Matriz resultante de la suma:");
            for (i = 0; i <= 2; i++){
                for (j = 0; j <= 2; j++) {
                    System.out.print(matrizs[i][j] + " ");
                }
    
            System.out.println("");
            }
        }
        

      }
    


       



        


        
  
    
