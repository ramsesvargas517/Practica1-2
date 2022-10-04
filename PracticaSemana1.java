/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.lec01.controller;

import javax.swing.*;

/**
 *
 * @author Pablo
 * Ejercicio #1
 */
public class PracticaSemana1 {

    /*
    *@param args the comand line arguments
     */
    public static void main(String[] args) {

        byte C = 0;
        short p = 5000;
        double t;
        byte M;
        double nt = 0;

        C = Byte.parseByte(JOptionPane.showInputDialog("Digite la cantidad"));

        t = C * p;
        
        JOptionPane.showMessageDialog(null,"El monto a pagar es " + t);
        
        
        while(nt == 0)
        {
            M = Byte.parseByte(JOptionPane.showInputDialog("Ingrese 1 para tarjeta o 2 para efectivo"));
            
            switch(M){
                case 1:
                    nt = t + (t*0.03);
                    JOptionPane.showMessageDialog(null,"Cantidad de producto: "+C+"\nTotal original: "+t+"\nNuevo total: "+nt);
                    break;
                case 2:
                    nt = t - (t*0.05);
                    JOptionPane.showMessageDialog(null,"Cantidad de producto: "+C+"\nTotal original: "+t+"\nNuevo total: "+nt);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un valor válido");
            }                    
        }
    }
}