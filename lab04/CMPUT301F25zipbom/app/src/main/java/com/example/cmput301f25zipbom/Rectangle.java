package com.example.cmput301f25zipbom;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }
