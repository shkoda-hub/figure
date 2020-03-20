package com.figure;

import java.util.ArrayList;

public class Calculation {
    public void calculationFigure() {
        ArrayList<Figure> listFigure = new ArrayList<>();
        listFigure.add(new Circle(4));
        for (Figure item : listFigure){
            item.perimeter(3);
            item.area(4);
        }







    }

}
