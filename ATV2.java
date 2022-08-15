/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class ATV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String senha = "";

        System.out.println("Insira o nome de usuário: ");
        nome = sc.next();

        System.out.println("Insira sua senha: ");
        senha = sc.next();

        while ((nome).equals(senha)) {
            System.out.println("Erro o nome não pode ser igual a senha");
            System.out.println("Insira o nome de usuário: ");
            nome = sc.next();

            System.out.println("Insira sua senha: ");
            senha = sc.next();
        }

    }

}
