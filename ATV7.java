
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ATV7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float maior, num;
        int count=2;
 
     System.out.print("Numero 1: ");
     num = entrada.nextFloat();
     maior = num;
 
     while(count <= 10){
      System.out.print("Numero " + count + ": ");
      num = entrada.nextFloat();
 
      if(num > maior){
       maior = num;
      }
      count++;
     }
     System.out.println("O maior numero digitado é: "+maior);
 
    }
}
    
    

