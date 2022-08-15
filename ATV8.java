
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ATV8 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 

        int a,b,c,d,e,soma;
        double media;


        System.out.println("Informe o primeiro numero:");
        a = sc.nextInt();
        
        System.out.println("Informe o segundo numero:");
        b = sc.nextInt();
        
        System.out.println("Informe o terceiro numero:");
        c = sc.nextInt();
        
        System.out.println("Informe o quarto numero:");
        d = sc.nextInt();
        
        System.out.println("Informe o quinto numero:");
        e = sc.nextInt();


 soma = a+ b + c + d + e;
 media = soma/5;

 System.out.println("Soma dos números:"+soma);
 System.out.println("Média dos números:"+media);

}

}
    
