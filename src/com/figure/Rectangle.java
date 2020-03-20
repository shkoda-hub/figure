package com.figure;

public class Rectangle extends Figure {
    double a;
    double b;
    double c;
    double d;

    public Rectangle (double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimeter() {
        double p = a+b+c+d;
        System.out.println("Периметр прямоуголника равен "+p);
        return p;
    }

    @Override
    public double area() {
        double s = a*b;
        System.out.println("Площадь прямоугольника равна "+s);
        return s;
    }
}
