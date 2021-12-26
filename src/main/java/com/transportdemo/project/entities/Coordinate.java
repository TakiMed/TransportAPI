package com.transportdemo.project.entities;

public class Coordinate {

    private String type;
    private Double x;
    private Double y;

    public Coordinate(String type, Double x, Double y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "type='" + type + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
