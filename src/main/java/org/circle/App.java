package org.circle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Circle area = new Circle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину радиуса круга: ");
        double radius = in.nextDouble();
        area.calculatorCircle(radius);
        area.resultCircle();
    }
}
