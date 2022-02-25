package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getRadius() {
        return width;
    }

    public void setRadius(double radius) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }

    @Override
    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
