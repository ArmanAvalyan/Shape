package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.getPerimeter(1.15);
        circle.getArea(1.15);
        System.out.println(circle);

        Square square = new Square();
        square.getArea(14.1);
        square.getPerimeter(14.1);
        System.out.println(square);

    }
}
