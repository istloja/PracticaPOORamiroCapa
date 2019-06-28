/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia27Junio;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Ingrese 1 para circulo 2 para triangulo 3 para cuadrado 4 Cubo 5 Esfera 6 Tetraedo ");
        int resultado = entrada.nextInt();
        switch (resultado) {
            case 1:
                System.out.println(" Ingrese el radio del circulo ");
                double radio = entrada.nextDouble();
                Circulo objeto = new Circulo();
                double areacirculo = objeto.calcularArea(radio);//llamar al metodo
                double perimetrocirculo = objeto.calcularPerimetro(radio);
                // System.out.println(objeto.calcularArea(radio));
                //System.out.println(objeto.calcularPerimetro(radio));
                System.out.println(" El area es" + areacirculo + " el perimetro es" + perimetrocirculo);
                break;// este va despues de cada case
            case 2:
                System.out.println(" vamos a calcular el area de un triangulo");
                System.out.println(" Ingrese la base ");
                double base = entrada.nextDouble();
                System.out.println(" Ingrese la altura ");
                double altura = entrada.nextDouble();
                Triangulo ob = new Triangulo();
                double areatri = ob.calcularArea(base, altura);
                System.out.println(" El area es:" + areatri);
                System.out.println(" Ahora el perimetro ");
                System.out.println(" ingrese sus 3 lados ");
                double lado1 = entrada.nextDouble();
                double lado2 = entrada.nextDouble();
                double lado3 = entrada.nextDouble();
                double perimetrotri = ob.calcularPerimetro(lado1, lado2, lado3);
                System.out.println(" El perimetro es: " + perimetrotri);
                break;
            case 3:
                System.out.println(" Es un cuadrado ");
                System.out.println(" vamos a calcular el area de un cuadrado ");
                System.out.println(" Ingrese el lado: ");
                double lado = entrada.nextDouble();
                Cuadrado obo = new Cuadrado();
                double areacuadrado = obo.calcularArea(lado);
                System.out.println(" El area es: " + areacuadrado);
                double perimetroCuadrado = obo.calcularPerimetro(lado);
                System.out.println(" El perimetro es: " + perimetroCuadrado);
                break;
            case 4:
                System.out.println(" Es un cubo ");
                System.out.println(" Vamos a calcular el Volumen de un cubo");
                System.out.println(" Ingrese las aristas del cubo ");
                double aristas = entrada.nextDouble();
                Cubo aris = new Cubo();
                double Volumenarista = aris.calcularVolumen(aristas);
                System.out.println(" El volumen es:" + Volumenarista);
                double areacubo = aris.calcularArea(aristas);
                System.out.println(" El area es: " + areacubo);
            case 5:
                System.out.println(" Es una esfera ");
                System.out.println(" Vamos a calcular el volumend de la esfera ");
                double esfera=entrada.nextDouble();
                Esfera obj=new Esfera();
                System.out.println(" Ingrese el radio ");
                double Volumenesfera=obj.calcularVolumen(radio, lado);

                
                
                
             
            default:
                System.out.println(" Ingrese un numero correcto ");
                break;
        }
    }
}
