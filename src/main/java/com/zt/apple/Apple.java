package com.zt.apple;

public class Apple {
    private String color;
    private int size;
    private int width;
    private String from;

    public Apple(String color, int size, int width, String from) {
        this.color = color;
        this.size = size;
        this.width = width;
        this.from = from;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", width=" + width +
                ", from='" + from + '\'' +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
