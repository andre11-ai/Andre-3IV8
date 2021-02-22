import javax.swing.JOptionPane;
public class Edad{
    //variables 
    private int nacimiento, actual, edad;
    private String entrada;

    //metodo con operaciones
    //preguntas para saber la edad
    public void CE(){
        JOptionPane.showMessageDialog(null,"Hola  ahora vamos a saber cual es tu edad");
        entrada = JOptionPane.showInputDialog("en que anno nacio");
        nacimiento = Integer.parseInt(entrada);
        if(nacimiento<=1900| nacimiento>=2022){
            JOptionPane.showInputDialog(null,"numero erroneo");
            entrada = JOptionPane.showInputDialog("en que anno nacio");
            nacimiento = Integer.parseInt(entrada);
        }
        //operaciones para obtener la edad
        entrada = JOptionPane.showInputDialog("Ingrese el ano actual");
        actual = Integer.parseInt(entrada);
        if (actual<=nacimiento|nacimiento>=2022){
            JOptionPane.showMessageDialog(null,"Ano no valido volver a ingresar");
            entrada = JOptionPane.showInputDialog("Ingrese su ano de actual");
            nacimiento = Integer.parseInt(entrada);
        }
        edad = actual-nacimiento;
        edad = edad-1;
        //resultado uwu
        JOptionPane.showMessageDialog(null,"Usted tiene "+edad+" annos unu");
    }
}