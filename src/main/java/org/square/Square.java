package org.square;

public class Square {
    public double res;
    public Square() {
    }
    public void calculatorSquare(double sideSquare) {
        res = (sideSquare * sideSquare);
    }
    public void result() {
        System.out.println("Площадь квадрата: " + res);
    }
}
