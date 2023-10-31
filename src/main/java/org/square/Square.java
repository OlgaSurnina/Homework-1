package org.square;

public class Square {
    public double res;

    public Square() {
    }

    public double calculatorSquare(double sideSquare) {
        res = (sideSquare * sideSquare);
        return res;
    }

    public void result() {
        System.out.println("Площадь квадрата: " + res);
    }
}
