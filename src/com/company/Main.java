package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(12);
        Rectangle rectangle2 = new Rectangle(14, 18);
        Rectangle rectangle3 = new Rectangle(13, 29);

        rectangle3.isTheSameRectangle(rectangle2);
        rectangle1.printArea();
        rectangle2.printRectangleKind();

    }
}
