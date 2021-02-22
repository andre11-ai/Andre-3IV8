import javax.swing.JOptionPane;

public class Sueldo {
    
    private String entrada;
    private int nombre, ID,sueldo_quincenal,horas_extras,extra,total,grande,respuesta,puesto;
    private double SGM,infonavit,ISR,total1;


    public void Su(){
        JOptionPane.showMessageDialog(null,"vamos a saber su sueldo");
        entrada = JOptionPane.showInputDialog("cual es su ID");
        ID = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Ingrese su nombre ");
        nombre = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Ingrese su puesto actual \1 1 jefe \2 2 empleado");
        puesto = Integer.parseInt(entrada);

        if(puesto!=0){
            entrada = JOptionPane.showInputDialog("Cunato ganas quincenalmente?");
            sueldo_quincenal= Integer.parseInt(entrada); 
            entrada = JOptionPane.showInputDialog("Ingrese si trabaja horas extra?  \n1Si  \n2No");
            horas_extras = Integer.parseInt(entrada);   
            if(horas_extras == 1 ){
                entrada = JOptionPane.showInputDialog("Ingrese si fueron \n1 Diurna o \2Nocturnas ");
                respuesta = Integer.parseInt(entrada);
                if(respuesta == 1){
                    entrada = JOptionPane.showInputDialog("Ingrese cuantas horas extra fueron");
                    horas_extras = Integer.parseInt(entrada);
                    extra = horas_extras*50;
                    total = extra+sueldo_quincenal;

                    JOptionPane.showMessageDialog(null,"tu suledo neto estra es de: "+total);
                }else{
                    entrada = JOptionPane.showInputDialog("Ingrese cuantas horas extra fueron");
                    horas_extras = Integer.parseInt(entrada);
                    extra = horas_extras*60;
                    total = extra+sueldo_quincenal;
                    JOptionPane.showMessageDialog(null,"tu suledo neto extra es de: "+total);
                }

            }else{
                JOptionPane.showMessageDialog(null,"tu suledo neto es de: "+sueldo_quincenal);
            }
        }else{
            entrada = JOptionPane.showInputDialog("Ingrese cuanto gana quincenalmente");
            sueldo_quincenal = Integer.parseInt(entrada);
            infonavit= sueldo_quincenal*.20;
            SGM = sueldo_quincenal*.10;
            ISR = sueldo_quincenal*.16;
            total1 = sueldo_quincenal-infonavit-SGM-ISR;
            JOptionPane.showMessageDialog(null,"tu suledo neto es de: "+total1);
        }




    }




}

