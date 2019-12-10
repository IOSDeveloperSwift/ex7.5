package com.Doloscan;

public class Rectangle {


    int length;
    int width;

    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter: " + 2 * (length + width));
    }


}
