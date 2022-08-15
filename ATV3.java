
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ATV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String nome;
       int idade;
       float salario;
       char sexo, estado_civil;



       while(true){

           System.out.print("Informe seu nome: ");
           nome = sc.nextLine();

           if (nome.length() > 3){

               break;

           }else{
               System.out.println("O nome precisa ser maior de 3 caracteres!");
           }
       }    

       while(true){

           System.out.print("Informe sua idade: ");
           idade = sc.nextInt();

           if (idade > 0 && idade <= 150){
               break;
           }else{
               System.out.println("A idade precisa estar entre 0 e 150 anos!");
           }
       }

       while(true){

           System.out.print("Informe seu salário: ");
           salario = sc.nextFloat();
           
           if (salario > 0){

               break;

           }else{

               System.out.println("O salário precisa ser maior que 0!");
           }

       }

       while(true){

           System.out.print("Informe seu sexo[M/F]: ");
           sexo = sc.next().charAt(0);
           sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
           
           if (sexo == 'M' || sexo == 'F'){

               break;

           }else{

               System.out.println("O nome precisa ser 'M' ou 'F'!");
           }
       }

       while(true){

           System.out.print("Informe seu estado civil[c/s/v/d]: ");
           estado_civil = sc.next().charAt(0);
           estado_civil = (Character.toString(estado_civil).toLowerCase()).charAt(0);

           if (estado_civil == 'c' || estado_civil == 's' || estado_civil == 'v' || estado_civil == 'd'){

               break;

           }else{

               System.out.println("O estado civil inválido!");

           }

       }
    }
    
}
