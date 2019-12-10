package com.Doloscan;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter length for rectangle 1: ");
        rectangle1.length = scr.nextInt();
        System.out.print("Enter width for rectangle 1: ");
        rectangle1.width = scr.nextInt();

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.print("Enter length for rectangle 2: ");
        rectangle2.length = scr.nextInt();
        System.out.print("Enter width for rectangle 2: ");
        rectangle2.width = scr.nextInt();

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();


    }
}
