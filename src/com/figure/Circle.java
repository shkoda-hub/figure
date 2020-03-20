package com.figure;

public class  Circle extends Figure {
    double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double perimeter() {
        double p = 2*3.13*r;
        System.out.println("Периметр окружности равен "+p);
        return p;
    }

    @Override
    public double area() {
        double s = 3.14*(r*r);
        System.out.println("Площадь окружности равна "+s);
        return s;
    }
}
