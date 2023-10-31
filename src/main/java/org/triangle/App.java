package org.triangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Triangle result = new Triangle();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину 1ой стороны треугольника: ");
        double sideTriangle1 = in.nextDouble();
        System.out.println("Введите длину 2ой стороны треугольника: ");
        double sideTriangle2 = in.nextDouble();
        System.out.println("Введите длину основания треугольника: ");
        double sideTriangle3 = in.nextDouble();
        result.calcTriangle(sideTriangle1, sideTriangle2, sideTriangle3);
        result.areaTriangle();
    }
}