package org.example;

public class Trecho {
    public String exibirResultado() {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        return Integer.toString(soma);
    }
}
