package com.company;

public class Rectangle {
    private final static String RUSSIAN_CLASS_NAME = "прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "rectangle";
    private double x;
    private double y;
    public static int createdRectangles;


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    public double calculateArea() {
        double c = x * y;
        return c;
    }

    public void printArea() {
        System.out.println(calculateArea());
    }

    public void printRectangleKind() {
        if (x != y) {
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

    public static void printRectanglesCount() {
        System.out.println("Всего было создано: " + createdRectangles + " прямоугольников");
    }

    public static void printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }


}
