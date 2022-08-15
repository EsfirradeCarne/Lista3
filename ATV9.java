
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class ATV9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Digite uma numero:");
        numero = sc.nextDouble();

        while (numero < 1 || numero > 50) {

            System.out.println("Numero invalido! Digite outra numero.");
            numero = sc.nextDouble();
        }
        
            System.out.println("Numero valido!");

            for (numero = 1; numero < 50; numero++) {
                if (numero % 2 != 0) {
                    System.out.println("Numero valido!, valor impar:" + numero);
                    System.out.println(numero);
                }
            }

        }

    }

