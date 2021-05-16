package com.company;

public class Circle extends Shape {


    @Override
    public void getArea(double radius) {
        double area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area = " + area);
    }

    @Override
    public void getPerimeter(double radius) {
        double perimeter;
        perimeter = 2 * radius * Math.PI;
        System.out.println("Circle perimeter = " + perimeter);
    }

}
