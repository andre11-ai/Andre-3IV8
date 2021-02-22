import javax.swing.JOptionPane;



public class Provedores {
    
    private String nombre_cliente, entrada;
    private int i, mayor, menor, suma=0, y;
    private double promedio;
    private int[] producto = new int[9];
    private int[] costo = new int[9];
    private int[] cantidad = new int[9];
    
    public void Pr(){
        for(i=0; i<producto.length; i++){

            entrada = JOptionPane.showInputDialog("Introdusca los productos deseados" +i+1);
            producto[i] = Integer.parseInt(entrada);
        }
    
        for(i=0; i<producto.length; i++){
    
            JOptionPane.showMessageDialog(null,producto[i]);
        }
        //Costos
        for(i=0; i<costo.length; i++){
    
            entrada = JOptionPane.showInputDialog("Introdusca los costos de los productos" +i+1);
            costo[i] = Integer.parseInt(entrada);
            
        }
    
        for(i=0; i<costo.length; i++){
    
            JOptionPane.showMessageDialog(null,producto[i]);
            suma = suma + costo[i] ;
            JOptionPane.showMessageDialog(null,"El precio neto de los productos es de:"+suma);
            //sacar promedio de los productos  :,3
             
            promedio = suma/costo.length;
            JOptionPane.showMessageDialog(null,"El promedio del precio neto de los productos es de:"+promedio);
          
            //Sacar mayor y el menor.
            mayor = menor = costo [0];
            
            for (int i = 0; i < costo.length; i++) {
                if(costo[i] > mayor) {
                    mayor = costo[i];
                }
                if(costo[i]<menor) {
                    menor = costo[i];
                }
            }
            JOptionPane.showMessageDialog(null,"El precio mayor de los productos es de:"+mayor);
            JOptionPane.showMessageDialog(null,"El precio menor de los productos es de:"+menor);
    
        }
           
        
        // Cantidad
           for(i=0; i<cantidad.length; i++){
    
            JOptionPane.showMessageDialog(null,"Ingrese las cantidades:"+i+1);
            cantidad[i] = Integer.parseInt(entrada);
            
        }
    
        for(i=0; i<cantidad.length; i++){
    
            System.out.println(cantidad[i]);
            JOptionPane.showMessageDialog(null, cantidad[i]);
        }




           
        

        
    
    
     
    }
} 


