package org.example;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void exibirResultado(int numero, List<Integer> sequencia) {
        if (sequencia.contains(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static List<Integer> calcularSequenciaFibonacciAte(int numero) {
        List<Integer> sequencia = new ArrayList<>();
        int a = 0, b = 1;

        sequencia.add(a);
        if (numero >= 1) {
            sequencia.add(b);
        }

        while (b <= numero) {
            int temp = b;
            b = a + b;
            a = temp;
            if (b <= numero) {
                sequencia.add(b);
            }
        }

        return sequencia;
    }
}
