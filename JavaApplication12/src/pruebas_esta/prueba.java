/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas_esta;

/**
 *
 * @author edgar
 */
public class prueba {
     public static int factorial(int numero){
         int factorial; 
         
          if (numero==0){
    return 1;
     }else{   
            return numero * factorial(numero-1);
    }
          
     }
    public static void main(String[] args){
     
      System.out.println(factorial(20));
      
    
        }
        
}
