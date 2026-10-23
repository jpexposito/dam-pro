package ies.puerto.es;

import java.util.Scanner;

/**
 * @author jpexposito
 * @version 1.0.0
 */
public class AnalizadorContrasena {

    /**
     * Programa principal
     */
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cadena");
        String sCadena = teclado.nextLine();
        String resultado = generarInforme(sCadena);
        System.out.println(resultado);
    }

    /**
     * Funcion que cuenta el numero de mayusculas de una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de mayusculas
     */
    static int contarMayusculas(String sCadena) {
        int numero = 0;
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isUpperCase(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    static int contarMinusculas(String sCadena) {
        int numero = 0;
        //numero = 9 - 1 - 4 -1
        return sCadena.length() - contarMayusculas(sCadena) - contarDigitos(sCadena) - contarSimbolos(sCadena);
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)
        /**
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isAlphabetic(caracter) && Character.isLowerCase(caracter)) {
                numero++;
            }
        }
        return numero;
         **/
    }

    static int contarDigitos(String sCadena) {
        int numero = 0;
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    static int contarSimbolos(String sCadena) {
        int numero = 0;
        //Java2026! |J|a|v|a|2|0|2|6|!|
        //          |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    static boolean tieneLongitudMinima(String sCadena) {
        if (sCadena.length()<8) {
            return false;
        }
        return true;
    }

    static boolean esContrasenaValida(String sCadena) {
        if (!tieneLongitudMinima(sCadena)) {
            return false;
        }
        if (contarMayusculas(sCadena) < 1) {
            return false;
        }
        if (contarMinusculas(sCadena) < 1) {
            return false;
        }
        if (contarDigitos(sCadena) < 1) {
            return false;
        }
        return true;
    }

    static String generarInforme(String sCadena) {
        return  "Dígitos:"+contarDigitos(sCadena)
                + "Resultado:"+esContrasenaValida(sCadena);
    }
}
