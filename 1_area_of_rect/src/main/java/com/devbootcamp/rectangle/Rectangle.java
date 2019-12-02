package com.devbootcamp.rectangle;

// understands a polygon with perpendicular adjacent sides
public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {


        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}
