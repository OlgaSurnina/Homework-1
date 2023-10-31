package org.square;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Square area = new Square();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата: ");
        double sideSquare = in.nextDouble();
        area.calculatorSquare(sideSquare);
        area.result();
    }
}
