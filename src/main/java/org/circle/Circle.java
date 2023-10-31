package org.circle;

public class Circle {
    public double resCircle;

    public Circle() {
    }

    public double calculatorCircle(double radius) {
        resCircle = (3.14 * radius * radius);
        return resCircle;
    }

    public void resultCircle() {
        System.out.println("Площадь круга: " + resCircle);
    }
}
