package com.company;

public class Rectangle {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
    }

    public double calculateArea() {
        double c = x * y;
        return c;
    }

    public void printArea() {
        System.out.println(calculateArea());
    }

    public void printRectangleKind() {
        if (x!=y) {
            System.out.println("Это прямоугольник");
        } else {
            System.out.println("Это квадрат");
        }
    }

    public boolean isTheSameRectangle(Rectangle a) {
        if (a.x == this.x && a.y == this.y) {
            System.out.println("Прямоугольники равны");
            return true;
        } else {
            System.out.println("Прямоугольники не равны");
            return false;
        }

    }



}
