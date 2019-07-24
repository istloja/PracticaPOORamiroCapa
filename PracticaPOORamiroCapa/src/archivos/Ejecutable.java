/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Ingrese 1 mostrar archivos en documentos 2 mostrar imagenes 3 musica 4 videos 5 Netbeans Project");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                File archivo = new File("C:\\Users\\ISTLOJAV\\Documents");

                String[] arregloarchivos = archivo.list();//carpeta.list devuelve un arreglo con los archivos de una carpeta
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos[i]);
                }

                break;
            case 2:
                File archive = new File("C:\\Users\\ISTLOJAV\\Pictures");
                String[] arregloarchivo = archive.list();
                for (int i = 0; i < arregloarchivo.length; i++) {
                    System.out.println(arregloarchivo[i]);
                }
                break;
            case 3:
                File archi = new File("C:\\Users\\ISTLOJAV\\Music");
                String[] arregloarchivoo = archi.list();
                for (int i = 0; i < arregloarchivoo.length; i++) {
                    System.out.println(arregloarchivoo[i]);

                }
                break;
            case 4:
                File arch = new File("C:\\Users\\ISTLOJAV\\Videos");
                String[] arregloarchiv = arch.list();
                for (int i = 0; i < arregloarchiv.length; i++) {
                    System.out.println(arregloarchiv[i]);

                }
                break;
            case 5:
                File archiv = new File("C:\\Users\\ISTLOJAV\\Documents/NetBeansProjects");
                String[] arregloa = archiv.list();
                for (int i = 0; i < arregloa.length; i++) {
                    System.out.println(arregloa[i]);

                }

            default:
        }

    }
}
