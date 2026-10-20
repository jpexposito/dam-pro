package ies.puerto.es;

/**
 * @author jpexposito
 * @version 1.0.0
 */
public class DatosPersonales {

    static void main() {

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
        int valor = Integer.valueOf(sEdad);
        return Integer.parseInt(sEdad);
    }
}
