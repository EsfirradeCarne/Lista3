
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class ATV10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois numeros inteiros: ");

        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int menorNumero = 0;
        int num1;
        int num2;
        int soma;

        if (primeiroNumero < segundoNumero) {

            menorNumero = primeiroNumero;

        } else {

            menorNumero = segundoNumero;

            int diferenca = Math.abs(primeiroNumero - segundoNumero);
            for (int i = 1; i < diferenca; i++) {
                System.out.print(menorNumero + i + " ");
            }
            
            System.out.println("Entre com o primeiro número");
                num1 = sc.nextInt();

                System.out.println("Entre com o segundo número");
                num2 = sc.nextInt();

                soma = 0;

                for (int i=num1; i<=num2; i++){
                    soma += i;
                }
            
        }
    }
}