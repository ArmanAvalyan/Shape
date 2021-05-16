package com.company;

public class Circle extends Shape {

    @Override
    public double getArea(double radius) {
        setArea(Math.PI * Math.pow(radius, 2));
        return getArea();
    }

    @Override
    public double getPerimeter(double radius) {
        setPerimeter(2 * radius * Math.PI);
        return getPerimeter();
    }
}
