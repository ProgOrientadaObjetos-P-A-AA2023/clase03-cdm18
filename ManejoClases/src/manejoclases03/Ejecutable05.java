/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALA H
 */
public class Ejecutable05 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       sc = sc.useLocale(Locale.US);	       
       String auxiliarNombre;
       int auxiliarCamas;
       double auxiliarPresupuesto;
       
        Hospital miHospital = new Hospital ();
       // asignar valores por teclado
        System.out.println("Ingrese el hombre del hospital");
        auxiliarNombre = sc.nextLine();
        
        miHospital.establecerNombre(auxiliarNombre);
        
        System.out.println("Ingrese el numero de camas del hospital");
        auxiliarCamas = sc.nextInt();
        
        miHospital.establecerNumeroCamas(auxiliarCamas);
        
        System.out.println("Ingrese el presupuesto total del hospital");
        auxiliarPresupuesto = sc.nextDouble();
        
        miHospital.establecerPresupuesto(auxiliarPresupuesto);
        
       
          System.out.printf("%s - %d - %.2f\n", miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());
        
       
       
    }
}
