/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber1;

import java.util.Scanner;

/**
 *
 * @author RamiroA
 */
public class NewClass {

    int añonacimiento;
    int añoactual;

    public double suma(double numero1, double numero2) {
        double res;
        return 0;

    }

    public double resta(double num1, double num2) {
        double res;
        return 0;

    }

    public double multiplicacion() {
        double res;
        return 0;
    }

    public double division() {
        double res;
        return 0;
    }

    public double potencia() {
        double res;
        return 0;
    }

    public int calcularEdad(int añoactual, int añonacimiento) {
        int res;
        res = añoactual - añonacimiento;
        return res;
    }

    public String cadena(String texto) {
        String sCadena = "texto";
        System.out.println(sCadena.toLowerCase());//para cambiar de mayusculas a minusculas
        String mayuscula = sCadena.toUpperCase();//para cambiar de minusculas a mayusculas
        return null;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NewClass objeto = new NewClass();
        int resultado;
        String texto;
        resultado = objeto.calcularEdad(1999, 2019);
        System.out.println(resultado);
        String sCadena = "HOLA MUNDO";
        String minuscula = sCadena.toLowerCase();
        System.out.println(sCadena.toLowerCase());
        String Cadena = "hola mundo";
        String mayuscula = Cadena.toUpperCase();
        System.out.println(Cadena.toUpperCase());

    }
}
