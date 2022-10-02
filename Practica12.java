/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pkg2;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author ramse
 */
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ejercicio #1 practica #1
        double años_antiguedad,horas_laboradas,precio_hora,pago_semana,
                salario_bruto,deducciones,salario_neto;
        años_antiguedad = Double.parseDouble(JOptionPane.showInputDialog
        ("Ingrese cuantos años a trabajado"));
        horas_laboradas = Double.parseDouble(JOptionPane.showInputDialog
        ("Ingrese las horas trabajadas "));
        precio_hora = Double.parseDouble(JOptionPane.showInputDialog
        ("Ingrese cuanto le pagan por hora"));
        pago_semana = horas_laboradas * precio_hora;
        salario_bruto=pago_semana * 4;
        if (años_antiguedad >= 10 ){
            salario_bruto= salario_bruto * 0.2;
            if (salario_bruto >= 1000){
                deducciones=0.2;
                salario_bruto = salario_bruto - deducciones; 
            }
            else{
                    if (salario_bruto >= 2000) {
                        deducciones= 0.15;
                        salario_bruto= salario_bruto - deducciones;
                    
                    }
                        }
            
        }
        salario_neto= salario_bruto;
        JOptionPane.showMessageDialog(null,
            "Su salario fue de: "+ salario_neto);
        
    //Ejercicio #3 practica #3    
        Scanner datos = new Scanner(System.in);

        int contador_positivos = 0;
        int contador_negativos = 0;
        int suma = 0;
        for (int i = 0; i < 10 ; i++){
        System.out.println("introduce un numero");
        suma= suma + i;
        int a = datos.nextInt();
        if (a > 0){
            contador_positivos ++;
        }
        if (a<0){
            contador_negativos ++;
        }
        if (i == 9){
            System.out.println("Total de positivos es:" + contador_positivos);
            System.out.println("Total de negativos es:" + contador_negativos);
            } 
 
        }
 
    
    }
    
    
}
