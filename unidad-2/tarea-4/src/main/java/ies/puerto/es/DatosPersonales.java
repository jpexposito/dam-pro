package ies.puerto.es;

import java.util.Scanner;

/**
 * @author jpexposito
 * @version 1.0.0
 */
public class DatosPersonales {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad:");
        String sEdad = teclado.nextLine();
        System.out.println("Introduce la altura:");
        String sAltura = teclado.nextLine();
        System.out.println("Introduce la matricula:");
        String sMatricula = teclado.nextLine();

        double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(iEdad);
        String ficha = formatearFicha(sNombre,iEdad,dAltura,bMatricula,bMayorEdad);
        System.out.println(ficha);

    }

    /**
     * Funcion que transforma la edad en string a entero
     * @param sEdad String que almacena la edad
     * @return int de la edad
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return  0;
        }
        int valor = Integer.parseInt(sEdad);
        return Integer.parseInt(sEdad);
    }

    /**
     * Funcion que transforma la altura a double
     * @param sAltura String con la altura
     * @return double con la altura
     */
    static double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(sAltura);
    }

    static boolean convertirMatricula(String sMatricula) {
        if(sMatricula == null || sMatricula.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion que comprueba si una persona es mayor de edad
     * @param iEdad integer con la edad de la persona
     * @return true/false
     */
    static boolean esMayorDeEdad(int iEdad) {
        return iEdad >= 18;

    }

    static Integer convertirEdadAEnvolvente(int iEdad) {
        return  Integer.valueOf(iEdad);
    }

    static int recuperarEdadPrimitiva (Integer iEdad) {
        if (iEdad == null) {
            return 0;
        }
        return iEdad.intValue();
    }

    /**
     * Funcion formatea la ficha
     * @param sNombre String nombre de la ficha
     * @param iEdad integer edad de la ficha
     * @param bMatricula boolean matricula de la ficha
     * @param dAltura double altura de la ficha
     * @param bMayorEdad boolean mayor de edad de la ficha
     * @return
     */
    static String formatearFicha(String sNombre, int iEdad, double dAltura
                ,boolean bMatricula, boolean bMayorEdad) {
        return "Ficha:"+sNombre+",edad:"+iEdad+",altura:"+dAltura
                +",matricula:"+bMatricula+",mayor de edad:"+bMayorEdad;
    }
}
