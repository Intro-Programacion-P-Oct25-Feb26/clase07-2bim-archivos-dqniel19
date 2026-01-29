/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author UTPL
 */
public class ClasificacionPlacas {

    public static void comparacionPlaca(String reporte, String placa) {
        String a = placa.substring(0, 1);
        if (a.equals("L")) {
            try {
                FileOutputStream fos = new FileOutputStream
                ("data/placasDeLoja.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", reporte);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);

            }
        } else if (a.equals("G")) {
            try {
                FileOutputStream fos = new FileOutputStream
                ("data/placasDeGuayas.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", reporte);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);
            }
        } else if (a.equals("P")) {
            try {
                FileOutputStream fos = new FileOutputStream
                ("data/placasDePichincha.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", reporte);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);
            }
        } else {
            try {
                FileOutputStream fos = new FileOutputStream
                ("data/placasRestoCiudades.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", reporte);
                salida.close();

            } catch (Exception e) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);
            }}
    }

}
