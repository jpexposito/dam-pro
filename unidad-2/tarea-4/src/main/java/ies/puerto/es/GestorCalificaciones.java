package ies.puerto.es;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorCalificaciones {


    static void main() {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            Double nota = solicitarNotaValida();
            notas.add(nota);
            System.out.println("Deseas añadir otra nota: true/false");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        } while (salir);

        System.out.println("Lista de notas:"+notas);
        double media = calcularMedia(notas);
        System.out.println("La nota media es:"+media);
        double minimo = obtenerMinimo(notas);
        System.out.println("El valor minimo es:"+minimo);
        double maximo = obtenerMaxima(notas);
        System.out.println("El valor maximo es:"+maximo);


    }

    static int convertirNumeroNota(String sNumero) {
        int numero = 0;
        if(sNumero == null || sNumero.isEmpty()) {
            return 0;
        }

//return Integer.parseInt(sNumero);
        numero = Integer.parseInt(sNumero);
        return numero;
    }

    static double convertirNota(String sNumero) {
        double numero = 0;

        if (sNumero == null || sNumero.isEmpty()) {
            return 0;
        }
        numero = Double.parseDouble(sNumero);
        return numero;
    }

    static boolean esNotaValida(Double dNumero) {

        if (dNumero == null) {
            return false;
        }

        if (Double.isInfinite(dNumero) || Double.isNaN(dNumero)) {
            return false;
        }

        if (dNumero < 0 || dNumero > 10) {
            return false;
        }



        return true;
    }

    static Double solicitarNotaValida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota:");
        String sNota = teclado.nextLine();
        Double dNumero = null;
        try{
             dNumero = convertirNota(sNota);
        } catch (NumberFormatException e) {
            throw new RuntimeException("El numero insertado es incorrecto");
        }

        boolean bValida = esNotaValida(dNumero);
        return dNumero;
    }

    static double calcularMedia(List<Double> dNotas) {
        double media = 0;
        double suma = 0;
        for (int i = 0; i < dNotas.size(); i++) {
            suma = suma + dNotas.get(i);
        }
        media = suma/dNotas.size();
        return media;
    }

    static double obtenerMaxima(List<Double> lNotas) {
        double maximo = 0;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) > maximo) {
                maximo = lNotas.get(i);
            }
            if (maximo == 10) {
                return maximo;
            }
        }
        return maximo;
    }

    static double obtenerMinimo(List<Double> lNotas) {
        double minimo = 10;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
            if (minimo == 0) {
                return minimo;
            }
        }
        return minimo;
    }


}
