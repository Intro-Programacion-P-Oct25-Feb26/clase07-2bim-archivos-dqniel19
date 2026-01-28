/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UTPL
 */
public class leerArchivo {

    public static void imprimir() {
        double a = 0;
        double b;
        double c = 0;
        try {

            Scanner entrada = new Scanner(new File("data/datosDos.txt"));
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                a = a + Double.parseDouble(linea_partes.get(3));
                // b = Double.parseDouble(linea_partes.get(3));
                c = a / 2;
            }
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
        
        System.out.printf("Promedio: %.2f", c);
    }

}
