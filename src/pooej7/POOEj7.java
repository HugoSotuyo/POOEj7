/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author hdsot
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MasaCorporal;
        double sobrepeso=0;
        double bajopeso=0;
        double ideal=0;
        double mayor=0;
        double porcentMayor;
        double porcentSobrepeso;
        double porcentidealpeso;
        double porcentbajopeso;
        boolean mayoredad;
        
        PersonaServicio person = new PersonaServicio();
        
        Persona p1 = person.crearPersona();
        Persona p2 = person.crearPersona();
        Persona p3 = person.crearPersona();
        Persona p4 = person.crearPersona();
        
        MasaCorporal=person.clacularMC(p1.getPeso(),p1.getAltura());
        switch (MasaCorporal) {
            case 1:
                System.out.println("p1 Tiene sobrepeso");
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                System.out.println("p1 Peso ideal");
                ideal = ideal +1;
                break;
            case -1:
                System.out.println("p1 tiene peso bajo");
                bajopeso = bajopeso +1;
                break;
        }
        MasaCorporal=person.clacularMC(p2.getPeso(),p2.getAltura());
        switch (MasaCorporal) {
            case 1:
                System.out.println("p2 Tiene sobrepeso");
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                System.out.println("p2 Peso ideal");
                ideal = ideal +1;
                break;
            case -1:
                System.out.println("p2 tiene peso bajo");
                bajopeso = bajopeso +1;
                break;
        }
        MasaCorporal=person.clacularMC(p3.getPeso(),p3.getAltura());
        switch (MasaCorporal) {
            case 1:
                System.out.println("p3 Tiene sobrepeso");
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                System.out.println("p3 Peso ideal");
                ideal = ideal +1;
                break;
            case -1:
                System.out.println("p3 tiene peso bajo");
                bajopeso = bajopeso +1;
                break;
        }
        MasaCorporal=person.clacularMC(p4.getPeso(),p4.getAltura());
        switch (MasaCorporal) {
            case 1:
                System.out.println("p4 Tiene sobrepeso");
                sobrepeso = sobrepeso +1;
                break;
            case 0:
                System.out.println("p4 Peso ideal");
                ideal = ideal +1;
                break;
            case -1:
                System.out.println("p4 tiene peso bajo");
                bajopeso = bajopeso +1;
                break;
        }
        mayoredad=person.esMayorDeEdad(p1.getEdad());
        if (mayoredad==true){
            mayor=mayor +1;
        }
        mayoredad=person.esMayorDeEdad(p2.getEdad());
        if (mayoredad==true){
            mayor=mayor +1;
        }
        mayoredad=person.esMayorDeEdad(p3.getEdad());
        if (mayoredad==true){
            mayor=mayor +1;
        }
        mayoredad=person.esMayorDeEdad(p4.getEdad());
        if (mayoredad==true){
            mayor=mayor +1;
        }
        porcentSobrepeso=(sobrepeso/4)*100;
        System.out.println("El porcentaje de sobrepeso es : " + 
               porcentSobrepeso + " % ");
        porcentidealpeso=(ideal/4)*100;
        System.out.println("El porcentaje de peso ideal es : " + 
               porcentidealpeso + " % ");
        porcentbajopeso=(bajopeso/4)*100;
        System.out.println("El porcentaje de bajo peso es : " + 
               porcentbajopeso + " % ");
        porcentMayor =(mayor/4)*100;
        System.out.println("El porcentaje mayor de edad es : " + 
               porcentMayor + " % ");
    }
}
