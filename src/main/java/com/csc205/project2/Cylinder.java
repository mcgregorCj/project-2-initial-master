package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double v, double z) {
        super();
        this.height = v;
        this.radius = z;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double surfaceArea() { return ((2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * height)); }

    @Override
    public double volume() { return Math.PI * Math.pow(radius, 2) * height; }
}
