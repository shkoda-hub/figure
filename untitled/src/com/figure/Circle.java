package com.figure;

public class Circle extends Figure {
    public final double r;

    public Circle(double r){
        this.r = r;
    }


    @Override
    public double perimeter(double r) {
        double p = 2*3.14*r;
        System.out.println("Периметр круга равен "+p);
        return p;
    }

    @Override
    public double area(double r) {
        double s = 3.14*(r*r);
        System.out.println("Площадь кру");
        return 0;
    }
}
