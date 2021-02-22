import java.util.*;
public class MatrizArreglo{
    public static void main(String[] args){
        //objeto 
        Scanner entrada = new Scanner(System.in);
        //variables 
        /*arreglo unidimencional 
        int arreglo[] = new int[20];
        for(int i = 0; i<arreglin.length; i++){
            System.out.println("Los numeros son:" +i);
        }
        */
        //arrglo bidiminsional 
        int matriz[][] = new int [3][3];
        float sumarFilas=0;
        //filas 
        for (int i=0; i<matriz.length; i++){
            //columnas
            for(int j=0; j<matriz.length; j++){
                System.out.println("Ingresa el numero de fila" + i + " columna " + j +" : ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        //suma 
        for(int i = 0; i<matriz.length; i++){
            sumarFilas = 0;
            for(int j = 0; j<matriz.length; j++){
                //sumar los valores de las filas
                sumarFilas += matriz[i][j];
                System.out.println(String.format(" %d" , matriz[i][j]));
            }
            //promedio 
            System.out.println(String.format("Suma fila : %f" , sumarFilas, sumarFilas/matriz.length));
            //obtiene el tamaño de la matriz
            System.out.println();
        }
    }
}
