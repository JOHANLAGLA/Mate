/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematicas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matematicas {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Diguite 2 numeros:");
       
       
       Operacion op = new Operacion();
       op.n1 = leer.nextInt();
       op.n2 = leer.nextInt();
      
       
       op.suma();
       op.resta();
       op.mult();
       op.div();
       op.mostrarresultados();
    }
    
}
