import javax.swing.JOptionPane;
public class Principal{

    //variables 
    Edad ap = new Edad();
    PerimetrosyAreas ep = new PerimetrosyAreas();
    Llamadas ip = new Llamadas();
    // menu principal
    public static void main(String[] args){

        Principal menu = new Principal();
        int opcion;
        String texto;
        do{
            menu.menus();
            texto = JOptionPane.showInputDialog("Para Repetir escriba 5");
            opcion = Integer.parseInt(texto);
        }while (opcion==5);

    }


    
        public void menus(){
            int opcion;
            String ka;
            ka = JOptionPane.showInputDialog("Hecho par Andre Eduardo Ayala Sanchez 3IV8 \n1 program edades, \n2, programa perimetros y areas \n3 programa llamdas");
            opcion = Integer.parseInt(ka);
            switch(opcion){
                case 1:
                ap.CE();
                break;

                case 2:
                ep.pya();
                break;

                case 3:
                ip.lla();
                break;

                default:
                break;
            }
        }
    
}
