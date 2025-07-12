package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double deger) {
        this.width = (deger < 0) ? 0 : deger;
    }

    public void setHeight(double deger) {
        this.height = (deger < 0) ? 0 : deger;
    }

    public double getArea() {
        return width * height;
    }
}
