package org.circle;

public class Circle {
    public double resCircle;
    public Circle() {
    }
    public void calculatorCircle(double radius) {
        resCircle = (3.14 * radius * radius);
    }
    public void resultCircle() {
        System.out.println("Площадь круга: " + resCircle);
    }
}
