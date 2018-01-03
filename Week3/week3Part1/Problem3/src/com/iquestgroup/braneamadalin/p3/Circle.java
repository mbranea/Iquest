package com.iquestgroup.braneamadalin.p3;

/**
 * The class for the definition of the circle element
 */
public class Circle extends Element {

    private Point centerPoint;
    private int radius;

    public Circle(Point centerPoint, int radius) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }
}
