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
        Persona[] vectorPersona=new Persona[4];
        
        PersonaServicio person = new PersonaServicio();
        
        Persona p1 = person.crearPersona();
        Persona p2 = person.crearPersona();
        Persona p3 = person.crearPersona();
        Persona p4 = person.crearPersona();
        
        vectorPersona[0]=p1;
        vectorPersona[1]=p2;
        vectorPersona[2]=p3;
        vectorPersona[3]=p4;
        
        for (int i = 0; i < 4; i++) {
            MasaCorporal = person.clacularMC(vectorPersona[i].getPeso(), vectorPersona[i].getAltura());
            switch (MasaCorporal) {
                case 1:
                    //"p"+i+1+
                    System.out.println(vectorPersona[i].getNombre() + " tiene sobrepeso");
                    sobrepeso = sobrepeso + 1;
                    break;
                case 0:
                    System.out.println(vectorPersona[i].getNombre() + " tiene Peso ideal");
                    ideal = ideal + 1;
                    break;
                case -1:
                    System.out.println(vectorPersona[i].getNombre() + " tiene peso bajo");
                    bajopeso = bajopeso + 1;
                    break;
            }
            mayoredad = person.esMayorDeEdad(vectorPersona[i].getEdad());
            if (mayoredad == true) {
                mayor = mayor + 1;
            }
        }
        
        porcentSobrepeso = (sobrepeso / 4) * 100;
        System.out.println("El porcentaje de sobrepeso es : "
                + porcentSobrepeso + " % ");
        porcentidealpeso = (ideal / 4) * 100;
        System.out.println("El porcentaje de peso ideal es : "
                + porcentidealpeso + " % ");
        porcentbajopeso = (bajopeso / 4) * 100;
        System.out.println("El porcentaje de bajo peso es : "
                + porcentbajopeso + " % ");
        porcentMayor = (mayor / 4) * 100;
        System.out.println("El porcentaje mayor de edad es : "
                + porcentMayor + " % ");
    }
}
