package org.triangle;

public class Triangle {
    public double areaFigure;
    public Triangle() {}
    public void calcTriangle(double sideTriangle1, double sideTriangle2, double sideTriangle3) {
        double p = (sideTriangle1 + sideTriangle2 + sideTriangle3) / 2;
        areaFigure = Math.sqrt(p * (p - sideTriangle1) * (p - sideTriangle2) * (p - sideTriangle3));
    }
    public void areaTriangle() {
        System.out.println("Площадь треугольника: " + areaFigure);
    }
}
