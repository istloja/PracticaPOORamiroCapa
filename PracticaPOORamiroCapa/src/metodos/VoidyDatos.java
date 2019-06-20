/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class VoidyDatos {
    //recibe informacion y la presenta en pantalla

    //Es un metodo de tipo void de suma dos numeros y presenta el resultado
    public void sumar(int numero1, int numero2) {//recibe dos numeros de tipo entero
        System.out.println("La suma es" + (numero1 + numero2));//presenta el resultado en pantalla
    }
// los metodos que devuelven datos pueden ser de diferentes tipos como
    //int, double, String, char, boolean, y también pueden ser objetos

    public int sumar1(int numero1, int numero2) {
        return numero1 + numero2;//devolvemos el valor
    }

    public String unirCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;

    }

    public boolean iniciaSesion(String usuario, String password) {
        boolean valor = false;
        if (usuario.equals("admin") && password.equals("1234")) {
            valor = true;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        VoidyDatos objeto = new VoidyDatos();//creamos un objeto
        objeto.sumar(10, 8);//llamamos al metodo sumar y enviamos 2 numeros
        objeto.sumar(11, 23);
        objeto.sumar(80, 7);
        int resultado = objeto.sumar1(40, 10);//guardo lo que devuelve el metodo sumar1
        System.out.println(" La suma " + resultado);
        String cadena = objeto.unirCadenas(" Hola ", "  ");
        System.out.println(" La cdena unida es: " + cadena);
        boolean inicio = objeto.iniciaSesion("admin", "12345");
        System.out.println(inicio);
        System.out.println("Ingrese usuario");
        String usuario;
        usuario = entrada.next();
        System.out.println("Ingrese contraseña");
        String password = entrada.next();
        boolean iniciaSesion = objeto.iniciaSesion(usuario, password);
        if (iniciaSesion) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Incorrecto, Intente nuevamente");
        }

    }
}
