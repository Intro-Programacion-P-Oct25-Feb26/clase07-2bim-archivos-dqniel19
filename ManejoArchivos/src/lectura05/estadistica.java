/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class estadistica {
    public static String imprimir() {
        double a = 0;
        double c = 0;
        int i = 0;
        String msj = "";
        try {

            Scanner entrada = new Scanner(new File("data/sucursales.txt"));
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                a = a + Double.parseDouble(linea_partes.get(2));
                i = i + 1;
                

            }
            c = a / i;
            msj = String.format("Promedio de empleados de todas las empresas: "
                    + "%.2f", c);
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        
        return msj;
    }
}
