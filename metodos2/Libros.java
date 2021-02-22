import javax.swing.JOptionPane;

public class Libros {
    
    private String  entrada, uwu;
    private int titulo, autor,  numero, opcion, ejemplares, total, subtotal, libros=10;


    public void Li(){

        do{
            entrada = JOptionPane.showInputDialog(" que es lo que deseas hacer \n1 1 prestamo de libro  \n2 2 Devolber un prestamo anterior");
            opcion = Integer.parseInt(entrada);

            switch(opcion){
                case 1:
                Prestamo();
                break;

                case 2:
                Devolber();
                break;
            }
            uwu = JOptionPane.showInputDialog("para repetir puslse 5");
            numero = Integer.parseInt(uwu);
        }while(numero == 5);
    }

    public void Prestamo(){
        JOptionPane.showMessageDialog(null,"vamos a saber sus prestamos y sus devoluciones de libros");
        entrada = JOptionPane.showInputDialog("Ingrese le numero del libro");
        titulo = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Ingrese el numero de autor del libro");
        autor = Integer.parseInt(entrada);
        JOptionPane.showMessageDialog(null,"La cantidad disponible es de:"+libros);

        try{
            entrada = JOptionPane.showInputDialog("cuantos ejemplares quieres ver?");
            ejemplares = Integer.parseInt(entrada);
            total =  libros - ejemplares;
            JOptionPane.showMessageDialog(null,"Las cantidades disponibles son:" +total);

        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"uwu SOLO ingresa cantidades disponibles");

        }
    }



    public void Devolber(){
        entrada = JOptionPane.showInputDialog("Cual es titulo de tu libro?");
        titulo = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Cual es el autor de tu libro?");
        autor = Integer.parseInt(entrada);

        try{
            JOptionPane.showMessageDialog(null,"Las cantidades disponibles son:" +total);
            entrada = JOptionPane.showInputDialog("Cuantos libros vas a devolver?");
            ejemplares = Integer.parseInt(entrada);
            total = libros - ejemplares;
            subtotal = libros + ejemplares;
            JOptionPane.showMessageDialog(null,"Las cantidades disponibles son:" +subtotal);
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"Gracia y si se pudo UwU");
        }
    }
}

