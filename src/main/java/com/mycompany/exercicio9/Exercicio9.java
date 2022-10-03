package com.mycompany.exercicio9;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio9 {

    public static void main(String[] args) {
//        Variaveis e scanner
        double temperaturaF, temperaturaC;
        Scanner entrada = new Scanner(System.in);
        
//        Entrada de dados pelo usuário
        System.out.print("Digite a temperatura: ");
        temperaturaF = entrada.nextDouble();
        entrada.close();
        
//        Operação feita para converter
        temperaturaC = 5 * ((temperaturaF-32)/9);
        
        System.out.print("A temeperatura em Celsius é: " + temperaturaC);
    }
}
