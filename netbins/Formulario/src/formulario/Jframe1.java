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
 
public class Jframe1 {
 
 
	public void llenarLista(){
		ArrayList<Person> lista = new ArrayList<Person>();
		//Llenar lista con la jTable
		PersonController.getInstance().setPersonas(lista);//aqui pone a apuntar el ArrayList de PersonController a la lista con los valores
		//Otra opcion es copiar todos los valores de lista al ArrayList de PersonController
		//System.arraycopy(lista, 0, PersonController.getInstance().getPersonas(), 0, lista.size());
	}
}