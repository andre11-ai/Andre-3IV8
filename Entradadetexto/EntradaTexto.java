//vamos a crear un archivo que se necarge de poder obtener un texto como esntra de texto de datos
class EntradaTexto{
    //cuerpo principal dep programa 
    public static void main(String[] args){
        //variables
        String nombre;

        System.out.println("POr favor, dime tu nombre:");
    
        nombre = System.console().readLine();
    
        System.out.println("Hola "+nombre+" bienvenido a tu segundo programa");
    
    
    }
}