package com.figure;

import java.util.ArrayList;

public class CalculationFigure {
    public void calculation() {
        ArrayList<Figure> listFigure = new ArrayList<>();
        listFigure.add(new Circle(5));
        listFigure.add(new Triangle(4,9,7));
        listFigure.add(new Rectangle(5, 3,5,3));

        for (Figure item : listFigure){
            item.perimeter();
            item.area();
        }


    }

}
