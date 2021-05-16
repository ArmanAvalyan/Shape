package com.company;

public class Square extends Shape {


    @Override
    public void getArea(double side) {
        double area;
        area = Math.pow(side, 2);
        System.out.println("Square area = " + area);

    }

    @Override
    public void getPerimeter(double side) {
        double perimeter;
        perimeter = 4 * side;
        System.out.println("Square perimeter = " + perimeter);
    }




}
