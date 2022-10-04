/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.lec01.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 * Ejercicio #4
 */
public class Practica2 {
    public static void main(String[] args) {
        byte temp;

        temp = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la temperatura"));

        if(temp <= 10){
            JOptionPane.showMessageDialog(null," El día está Frío");
        }
        else if (temp > 10 && temp <= 20){
            JOptionPane.showMessageDialog(null,"El día está Nublado");
        }
        else if (temp > 20 && temp <= 30){
            JOptionPane.showMessageDialog(null,"El día está Caluroso");
        }
        else if (temp > 30){
            JOptionPane.showMessageDialog(null,"El día está Tropical");
        }
    }        
}