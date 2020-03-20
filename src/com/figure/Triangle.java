package com.figure;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        double p = a+b+c;
        System.out.println("Периметр треугольника равен "+p);
        return p;
    }

    @Override
    public double area() {
        double P = (a+b+c)/2;
        double s = Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("Площадь треугольника равна "+s);
        return s;
    }
}
