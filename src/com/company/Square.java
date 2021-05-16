package com.company;

public class Square extends Shape {

    @Override
    public double getArea(double side) {
        setArea(Math.pow(side, 2));
        return getArea();
    }

    @Override
    public double getPerimeter(double side) {
        setPerimeter(4 * side);
        return getPerimeter();
    }
}
