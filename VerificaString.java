package org.example;

public class VerificaString {

    public static int contarLetraMaiuscula(String texto) {
        int contadorMaiuscula = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'A') {
                contadorMaiuscula++;
            }
        }
        return contadorMaiuscula;
    }

    public static int contarLetraMinuscula(String texto) {
        int contadorMinuscula = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a') {
                contadorMinuscula++;
            }
        }
        return contadorMinuscula;
    }
}
