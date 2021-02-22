/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
 
public class PersonController {
 
	private ArrayList<Formulario> personas;
	public static PersonController controller; //idea básica del patrón Singleton
 
	private PersonController(){
		personas=new ArrayList<Formulario>();
	}
 
	public static PersonController getInstance(){
		if(controller == null)
			controller = new PersonController();
		return controller;
	}
 
	public ArrayList<Formulario> getPersonas() {
		return personas;
	}
 
	public void setPersonas(ArrayList<Formulario> personas) {
		this.personas = personas;
        }
}