package com.listapalabrasunicas;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> palabras = new TreeSet<>();

        System.out.println("Ingrese varias palabras (escriba 'Q' para terminar):");

        while (true) {
            String palabra = scanner.next();
            if (palabra.equalsIgnoreCase("Q")) {
                break;
            }
            palabras.add(palabra);
        }

        System.out.println("\nPalabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        System.out.println("\n¿Desea buscar una palabra en la lista? (s/n)");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la palabra que desea buscar:");
            String palabraBuscar = scanner.next();

            if (palabras.contains(palabraBuscar)) {
                System.out.println("La palabra '" + palabraBuscar + "' está en la lista.");
            } else {
                System.out.println("La palabra '" + palabraBuscar + "' NO está en la lista.");
            }
        }

        System.out.println("Saliendo...");
        scanner.close();
    }
}