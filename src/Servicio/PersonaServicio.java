/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class PersonaServicio {
    public Persona crearPersona(){
        String sexo;
        Persona person=new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre "); 
        person.setNombre(leer.nextLine());
        System.out.println("Ingrese Edad");
        person.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo");
        System.out.println("H:Hombre  M:Mujer  O:Otro ");
        sexo=leer.next();
        if (sexo.equalsIgnoreCase("H")|| sexo.equalsIgnoreCase("M")|| sexo.equalsIgnoreCase("O")){
            person.setSexo(sexo);
        }else{
            System.out.println("Opcion invalida");
        }
        System.out.println("Ingrese Peso");
        person.setPeso(leer.nextDouble());
        System.out.println("Ingrese Altura");
        person.setAltura(leer.nextDouble());
        return person;
    }
    public int clacularMC(double peso,double altura){
        double masacorporal;
        int resultado=0;
        masacorporal=peso/(altura*altura);
        if (masacorporal < 20) {
            resultado = -1;
        } else if (masacorporal >= 20 && masacorporal <= 25) {
            resultado = 0;
        } else if (masacorporal > 25) {
            resultado = 1;
        }
    return resultado;    
    }
    public boolean esMayorDeEdad(int edad) {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
}
