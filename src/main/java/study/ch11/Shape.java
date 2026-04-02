package study.ch11;

import static java.sql.DriverManager.println;

abstract class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    abstract double getArea();

    void printColor() { println("색상: " + color);}
}

class Circle extends Shape {
    double radius;
    Circle(String c, double r){
        super(c); this.radius = r;
    }

    @Override
    double getArea() {
        return 0;
    }
}
