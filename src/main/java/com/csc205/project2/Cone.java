package com.csc205.project2;

public class Cone extends Shape {

    private double height;
    private double radius;
    private double slantLength;


    public Cone() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
        this.slantLength = 0.0;
    }

    public Cone(double v, double z) {
        super();
        this.radius = v;
        this.height = z;
        this.slantLength = Math.sqrt(Math.pow(v, 2) + Math.pow(z, 2));
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
    public double surfaceArea() {
        return Math.PI * radius * (radius + slantLength);
    }

    @Override
    public double volume() {
        return (1/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", slantLength=").append(slantLength);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
