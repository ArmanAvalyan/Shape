package com.company;

public abstract class Shape {

    private double area;
    private double perimeter;

    public abstract double getArea(double radius);

    public abstract double getPerimeter(double radius);

    @Override
    public String toString() {
        return "area = " + getArea() +
                ", perimeter = " + getPerimeter();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
