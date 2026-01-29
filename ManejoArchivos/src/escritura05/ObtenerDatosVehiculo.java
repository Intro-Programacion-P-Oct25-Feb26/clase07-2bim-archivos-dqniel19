/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class ObtenerDatosVehiculo {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String rta;
        boolean bandera = true;
        while (bandera) {
                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el tipo de su vehículo");
                String marca = entrada.nextLine();
                System.out.println("Ingrese la placa de su vehículo");
                String placa = entrada.nextLine();
                System.out.println("¿Desea ingresar otro perfil? (s/n)");
                rta = entrada.nextLine();

                cadenaFinal = String.format("%s %s %s\n",
                        nombre,
                        marca, placa);
                
                if (rta.equals("n") || rta.equals("N")) {
                    bandera = false;
                }

                ClasificacionPlacas.comparacionPlaca(cadenaFinal, placa);
            }
        }
    }// fin de main

