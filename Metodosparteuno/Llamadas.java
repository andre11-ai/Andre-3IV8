import javax.swing.JOptionPane;
public class Llamadas{
    

    //variables
    private int credito, opcion, uwu, recarga, llnacio, llinter, llcelul, lltotal;
    private long nucelular;
    private float nacionales=0.5f, internacionales=0.6f, celulares=0.2f, inicial=0;
    private String letra, entrada;

    //preguntas a usuario
    public void lla(){
        entrada = JOptionPane.showInputDialog("Ingresa tu numero");
        nucelular = Long.parseLong(entrada);
        entrada =JOptionPane.showInputDialog("cuanto tiene de credito??");
        credito = Integer.parseInt(entrada);

        //menu del programa Lamadas
        do{
            letra = JOptionPane.showInputDialog("que informacion quiere saber de la que esta en nuestro menu \n1 costo de llamada, \n2 Hacer una recarga, \n3 mi credito");
         
            opcion = Integer.parseInt(letra);

            switch(opcion){

                case 1:
                   llamadas();
                   break;

                case 2:
                   recargas();
                   break;

                case 3:
                   micredito();
                   break;

            }
            entrada = JOptionPane.showInputDialog("si quieres repetir persione 5");
            uwu = Integer.parseInt(entrada);
        }while (uwu == 5);


       
    }

    //metodos y operaciones del mismo programa
    public void llamadas(){
        entrada = JOptionPane.showInputDialog("cuantas llamadas nacioneles a realizado");
        llnacio = Integer.parseInt(entrada);
        if(llnacio<0 | llnacio>40){
            JOptionPane.showInputDialog(null,"numero erroneo");
            entrada = JOptionPane.showInputDialog("cuantas llamadas nacioneles a realizado");
            llnacio = Integer.parseInt(entrada);
        }

        llinter= llinter*llnacio;
        entrada = JOptionPane.showInputDialog("cuantas llamadas internacioneles a realizado");
        llinter = Integer.parseInt(entrada);
        if(llinter<0| llinter>40){
            JOptionPane.showInputDialog(null,"numero erroneo");
            entrada = JOptionPane.showInputDialog("cuantas llamadas nacioneles a realizado");
            llinter = Integer.parseInt(entrada);
        }

        llcelul= llinter*llcelul;
        entrada = JOptionPane.showInputDialog("cuantas llamadas a celular a realizado");
        llinter = Integer.parseInt(entrada);
        if(llinter<0|llinter>40){
            JOptionPane.showInputDialog(null,"numero erroneo");
            entrada = JOptionPane.showInputDialog("cuantas llamadas nacioneles a realizado");
            llcelul = Integer.parseInt(entrada);
        }

        llcelul=llinter*llnacio;
        inicial = llcelul+llinter+llnacio;
        lltotal = lltotal-(int)inicial;

        JOptionPane.showInputDialog("su credito despues de  laa llamadas es de :" +lltotal);

    }

    public void recargas(){

        entrada = JOptionPane.showInputDialog("Ingrese su recarga");
        recarga = Integer.parseInt(entrada);
        if(recarga<20|recarga>3000){
            JOptionPane.showMessageDialog(null,"cantidad erronea");
            entrada = JOptionPane.showInputDialog("Ingrese su recarga");
            recarga = Integer.parseInt(entrada);
        }
        lltotal= recarga + lltotal;
        JOptionPane.showMessageDialog(null,"Su credito es de"+lltotal);
    }
    

    public void micredito(){
        JOptionPane.showMessageDialog(null,"Su credito es de:"+lltotal);
    }
    
}
