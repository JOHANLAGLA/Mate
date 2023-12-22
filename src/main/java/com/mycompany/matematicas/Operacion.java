/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matematicas;

/**
 *
 * @author HP
 */
public class Operacion {
   int n1;
   int n2;
   int suma;
   int resta;
   int mult;
   int div; 
    //metodos
  
      public void suma( ){
       suma= n1+n2;
   }
   
   public void resta(){
       resta= n1-n2;
   }
   public void mult(){
       mult= n1*n2;
   }    
   
   public void div(){
       div=n1/n2;
       
   }
   
   public void mostrarresultados(){
            System.out.println("La suma es:"+suma);
            System.out.println("La resta es :"+resta);
            System.out.println("La mult es :"+mult);
            System.out.println("La div es: "+ div);
   } 
   
}
