/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INSPIRON
 */
public class ManejoEstructurasDos {

    public static void main(String[] args) {
        
        String mensajeReporte = "";

        String[] listaNombres = {"Marjan", "Jhon", "Rodrigo", "Miguel",
            "José"};
        
        String [] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica",
            "Pindal"};
        
        double [] listaSueldos = {900.1, 1000.2, 450.3, 1500.2, 861.9};
        
            mensajeReporte = String.format("%s%s\n\n", mensajeReporte,
                "*****Listado de trabajadores*****");
            

        for (int i = 0; i < listaNombres.length; i++) {
            mensajeReporte = String.format("%s%s de la ciudad de: %s,\n"
                    + "tiene un sueldo de: %.1f\n\n", 
                    mensajeReporte, listaNombres[i], listaCiudades [i],
                    listaSueldos [i]);
        }
        System.out.printf("%s\n", mensajeReporte);
    }
}
