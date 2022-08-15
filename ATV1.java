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
public class ATV1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota = -1;

        while ((nota < 0) || (nota > 10)) {
            System.out.println("Digite a sua nota: ");
            nota = sc.nextInt();
        }
    }
}
