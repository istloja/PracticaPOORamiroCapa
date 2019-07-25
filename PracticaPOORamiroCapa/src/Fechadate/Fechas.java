/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechadate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import sun.util.calendar.Gregorian;

/**
 *
 * @author ISTLOJAV
 */
public class Fechas {

    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        //pasar de un String a una fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Ingrese la fecha en el formato dd/MM/yyyy");
        String fecha = entrada.nextLine();
        Date fechanacimiento = null;
        try {
            //pasando el string a fecha
            fechanacimiento = formato.parse(fecha);
            System.out.println(fechanacimiento);
            //    System.out.println(fechanacimiento.before(fechaActual));
        } catch (Exception e) {
            System.out.println(e);

        }
        //permite manejar fechas
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(fechaActual);
        int añoactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(" año " + añoactual);
        System.out.println(" mes " + mesactual);
        System.out.println(" dia " + diactual);
        GregorianCalendar calendario1 = new GregorianCalendar();
        calendario1.setTime(fechanacimiento);
        int resultado, resultado1, resultado2;
        int añona = calendario1.get(GregorianCalendar.YEAR);
        resultado = (añoactual - añona);
        int mesnac = calendario1.get(GregorianCalendar.MONTH) + 1;
        resultado1 = mesactual + mesnac;
        int dianaci = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        resultado2 = (añoactual - añona) * (365) + (mesactual - mesnac) * (365 / 12);
        System.out.println("su edad es:" + resultado);
        System.out.println(" su mes es: " + resultado1);
        System.out.println(" su dia es: " + resultado2);
    }
}
