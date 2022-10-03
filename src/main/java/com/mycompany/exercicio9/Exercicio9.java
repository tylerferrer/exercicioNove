package com.mycompany.exercicio9;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio9 {

    public static void main(String[] args) {
        double temperaturaF, temperaturaC;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a temperatura: ");
        temperaturaF = entrada.nextDouble();
        entrada.close();
        
        temperaturaC = 5 * ((temperaturaF-32)/9);
        
        System.out.print("A temeperatura em Celsius é: " + temperaturaC);
    }
}
