/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Convertidor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        System.out.println(" Vamos a convertir medidas ");
        System.out.println(" Ingrese 1 para convertir Km a m o 2 de m a Km o 3 de Millas a m o 4 de m a Millas o 5 de pies a metros o 6 de metros a pies");
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                System.out.println(" Ingrese los kilometros ");
                double km = entrada.nextDouble();
                int m = 1000;
                double resultadokilometros;
                resultadokilometros = (km * m);
                System.out.println(" La respuesta es " + resultadokilometros + " metros ");
                break;
            case 2:
                System.out.println(" Ingrese los metros ");
                double metros = entrada.nextDouble();
                int kilometro = 1000;
                double resultadometros;
                resultadometros = (metros / kilometro);
                System.out.println(" La respuesta es: " + resultadometros + " kilometros ");
                break;
            case 3:
                System.out.println(" Ingrese las Millas ");
                double millas = entrada.nextDouble();
                double metro = 1609.34;
                double resul;
                resul = millas * metro;
                System.out.println(" La respuesta es: " + resul + " metros ");
                break;
            case 4:
                System.out.println(" Ingrese las metros ");
                double me = entrada.nextDouble();
                double milla = 1609.34;
                double re;
                re = me / milla;
                double respuesta;
                System.out.println(" La respuesta es: " + re + " millas ");
                break;
            case 5:
                System.out.println(" Ingrese los pies ");
                double pies = entrada.nextDouble();
                double met = 3.28084;
                double res;
                res = pies / met;
                System.out.println(" la respuesta es: " + res + " metros ");
                break;
            case 6:
                System.out.println(" Ingrese los metros ");
                double metr = entrada.nextDouble();
                double pie = 3.28084;
                double result;
                result = metr * pie;
                System.out.println(" La respuesta es: " + result + " pies ");
                break;
            default:
        }
    }

}
