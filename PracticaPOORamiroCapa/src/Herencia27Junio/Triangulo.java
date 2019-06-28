/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia27Junio;

/**
 *
 * @author ISTLOJAV
 */
public class Triangulo extends Figurabidimensional {

    public double calcularArea(double base,double altura) {
        return A=(base*altura)/2;
    }

    public double calcularPerimetro(double lado1,double lado2,double lado3) {
        return P=lado1+lado2+lado3;
    }

}
