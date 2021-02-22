/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ope {

    private int preg8;
    private int Preg9;
    private int preg10;
    private int preg7;
    private int Preg1;
    private int preg2;
    private int preg3;
    private int preg4;
    private int Preg5;
    private int preg6;
    private ArrayList<Formulario> listaPreg;
    private Object objarchivo;
    
    
      public Ope (int Preg1, int preg2, int preg3, int preg4, int Preg5, int preg6, int preg7, int preg8, int Preg9, int preg10) {
        this.Preg1 = Preg1;
        this.preg2 = preg2;
        this.preg3 = preg3;
        this.preg4 = preg4;
        this.Preg5 = Preg5;
        this.preg6 = preg6;
        this.preg7 = preg7;
        this.preg8 = preg8;
        this.Preg9 = Preg9;
        this.preg10 = preg10;
    }

       public void aceptaDatos(){
    
        Scanner entrada = new Scanner(System.in);
       System.out.println("1");
        Preg1 = (int) entrada.nextFloat();
        System.out.println("2");
        preg2 = (int) entrada.nextFloat();
        System.out.println("3");
        preg3 = (int) entrada.nextFloat();
        System.out.println("4");
        preg4 = (int) entrada.nextFloat();
        System.out.println("5");
        Preg5 = (int) entrada.nextFloat();
        System.out.println("6");
        preg6 = (int) entrada.nextFloat();
        System.out.println("7");
        preg7 = (int) entrada.nextFloat();
        System.out.println("8");
        preg8 = (int) entrada.nextFloat();
        System.out.println("9");
        Preg9 = (int) entrada.nextFloat();
        System.out.println("110");
        preg10 = (int) entrada.nextFloat();
        
    }
      
       public Ope(){
        //voy a inicializar los dos objetos privados
        listaPreg = new ArrayList<Formulario>();
        //sobrecargar el objeto
        listaPreg = objPreg();
    }
    
    //ya viene el CRUD
    
  
    private ArrayList<Formulario> objPreg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
