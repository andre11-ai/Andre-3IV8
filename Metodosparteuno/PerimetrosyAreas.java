import javax.swing.JOptionPane;
public class PerimetrosyAreas {

    //variables 
    private double area, perimetro, base, altura, radio;
    private int opcion, numero;
    private String entrada, uwu;
    
    //menu del programa PerimetrosyAreas
    public void pya(){
        do{
            entrada = JOptionPane.showInputDialog("Que areas y oerimetro quiere calcular \n1 circulo,  \n2 rectangulo,  \n3 cuadrado ,  \n4 triangulo");
          
            opcion = Integer.parseInt(entrada);

            switch(opcion){
                case 1:
                  Circulo();
                  break;
                
                case 2:
                  Rectangulo();
                  break;

                case 3:
                  Cuadrado();
                  break;

                case 4:
                  Triangulo();
                  break;
            }
            uwu = JOptionPane.showInputDialog("para repetir puslse 5");
            numero = Integer.parseInt(uwu);
        }while(numero == 5);
    }

    //metodos y operaciones del programa mismo

    public void Circulo(){
        JOptionPane.showInputDialog( null,"un circulo unu");
        uwu = JOptionPane.showInputDialog("ingrese el radio del circulo deseado  solo positivos");
        radio = Double.parseDouble(uwu);

        area = (radio*radio)*3.1416;
        JOptionPane.showMessageDialog(null," El area del circulo es de:" +area);

        perimetro = (radio*2)*3.1416;
        JOptionPane.showMessageDialog(null,"El perimetro del circulo es de:"+perimetro);
    }

    public void Rectangulo(){
        JOptionPane.showMessageDialog(null,"un Rectangulo unu SOLO POSITIVOS ");
        uwu = JOptionPane.showInputDialog("ingrese la base del rectangulo");
        base = Double.parseDouble(uwu);
        uwu = JOptionPane.showInputDialog("ingrese la altura del rectangulo");
        altura = Double.parseDouble(uwu);

        area = base*altura; 
        JOptionPane.showMessageDialog(null,"El area de un rectangulo es de:"+area);

        perimetro = (base*2)+(altura*2);
        JOptionPane.showMessageDialog(null,"El perimetro del rectangulo es de:" +perimetro);
    }

    public void Cuadrado(){
        JOptionPane.showMessageDialog(null,"un cuadrado unu   SOLO POSITIVOS");
        uwu = JOptionPane.showInputDialog("ingrese la bese del cuadrado");
        base = Double.parseDouble(uwu);

        area = base*base;
        JOptionPane.showMessageDialog(null,"El area del cuadrado es de:" +area);

        perimetro = base*4;
        JOptionPane.showMessageDialog(null,"El perimetro del cuadrado es de:" +perimetro);
    }

    public void Triangulo(){
        JOptionPane.showMessageDialog(null,"un triangulo unu SOLO POSITIVOS");
        uwu = JOptionPane.showInputDialog("ingrese la base del triangulo");
        base = Double.parseDouble(uwu);
        JOptionPane.showMessageDialog(null,"ingrese la altura dell triangulo");
        altura = Double.parseDouble(uwu);

        area = (base*altura)/2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es de:" +area);
         
        perimetro = base*3;
        JOptionPane.showMessageDialog(null,"El perimetro del triangulo es de:" +perimetro);
    }
}