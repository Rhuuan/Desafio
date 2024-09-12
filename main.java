package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercicio 01
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> sequencia = Fibonacci.calcularSequenciaFibonacciAte(numero);
        System.out.println("Sequência de Fibonacci até " + numero + ": " + sequencia);
        Fibonacci.exibirResultado(numero, sequencia);
        scanner.close();

        // Exercicio 02
        VerificaString texto = new VerificaString();
        int contagemMaiucula = texto.contarLetraMaiuscula("Uma FrAse qualquer!");
        int contagemMinuscula = texto.contarLetraMinuscula("Uma FrAse qualquer!");
        if(contagemMaiucula > 0) {
            System.out.println("A letra 'A' (maiúscula) aparece " + contagemMaiucula + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'A' (maiúscula) não aparece na frase");
        }
        if(contagemMinuscula > 0) {
            System.out.println("A letra 'a' (minúscula) aparece " + contagemMinuscula + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' (minuscula) não aparece na frase");
        }

        //Exercicio 03
        Trecho trecho = new Trecho();
        String resultado = trecho.exibirResultado();
        System.out.println("O valor da variavel soma é " + resultado);
        
    }
}
