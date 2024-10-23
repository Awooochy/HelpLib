//HelpLib by Awooochy, es una llibreria de metodes per ferte mes facil la vida a l'hora de fer coses a java.

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class HelpLib {
    public static void main(String[] args) {
        Version();
    }


    static void Version() {
        System.out.println("HelpLib Version 1.36");
    }

    //Operaciones con ints

    //Suma de enteros
    static int SumaInt(int x, int y) {
        return x + y;
    }
    //Resta de enteros
    static int RestaInt(int x, int y) {
        return x - y;
    }
    //Multiplicacion de enteros
    static int MultiInt(int x, int y) {
        return x * y;
    }
    //Division de enteros
    static int DivInt(int x, int y) {
        return x / y;
    }
    //Agarrar el residuo de la division
    static int ResiduoInt(int x, int y) {
        return x % y;
    }

    //Operaciones con floats

    //Suma de decimales
    static float SumaFloat(float x, float y) {
        return x + y;
    }
    //Resta de decimales
    static float RestaFloat(float x, float y) {
        return x - y;
    }
    //Multiplicacion de decimales
    static float MultiFloat(float x, float y) {
        return x * y;
    }
    //Division de decimales
    static float DivFloat(float x, float y) {
        return x / y;
    }
    //Agarrar el residuo de la division float
    static float ResiduoFloat(float x, float y) {
        return x % y;
    }

    //Operaciones con strings

    // Contar las veces que aparece un caracter en una cadena
    static int ContarCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    // Encontrar la primera posición de un caracter en una cadena
    static int EncontrarPosicionCaracter(String cadena, char caracter) {
        return cadena.indexOf(caracter);
    }

    // Invertir una cadena
    static String InvertirCadena(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    // Reemplazar todas las ocurrencias de un caracter por otro en una cadena
    static String ReemplazarCaracter(String cadena, char antiguo, char nuevo) {

        return cadena.replace(antiguo, nuevo);
    }

    // Convertir una cadena a mayúsculas
    static String ConvertirMayusculas(String cadena) {

        return cadena.toUpperCase();
    }

    // Convertir una cadena a minúsculas
    static String ConvertirMinusculas(String cadena) {

        return cadena.toLowerCase();
    }
    }