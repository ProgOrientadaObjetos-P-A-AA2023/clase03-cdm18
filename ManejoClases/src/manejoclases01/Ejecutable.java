/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;

//@author carlosmejia
public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 100;
        hospital.presupuesto = 560340.43;        
        // Se presenta valores en pantalla
        System.out.printf("Hospital %s - %d camas - %.1f$ de presupuesto\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);       
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);  
        Hospital sanCarlos = new Hospital ();
        sanCarlos.nombre = "San Carlos";
        sanCarlos.numeroCamas = 400;
        sanCarlos.presupuesto = 3123.22;
        sanCarlos.corrupcion = true;
        
        System.out.printf("Hospital %s - %d camas - %.1f$ de presupuesto - corrupcion = %s \n", sanCarlos.nombre,
                sanCarlos.numeroCamas, sanCarlos.presupuesto, sanCarlos.corrupcion);       
    }
}
