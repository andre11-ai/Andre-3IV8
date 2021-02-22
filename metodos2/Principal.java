import javax.swing.JOptionPane;
public class Principal{

    //variables 
    Sueldo ap = new Sueldo();
    Provedores ep = new Provedores();
    Libros ip = new Libros();
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
            ka = JOptionPane.showInputDialog("Hecho par Andre Eduardo Ayala Sanchez 3IV8 \n1 program Sueldo \n2 programa Provedores \n3 programa Libros");
            opcion = Integer.parseInt(ka);
            switch(opcion){
                case 1:
                ap.Su();
                break;

                case 2:
                ep.Pr();
                break;

                case 3:
                ip.Li();
                break;

                default:
                break;
            }
        }
    
}

