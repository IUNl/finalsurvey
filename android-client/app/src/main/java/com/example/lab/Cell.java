package com.example.lab;

/**
 * 代表每一个九宫格圆圈的Javabean
 * @author xuliugenpc
 */
public class Cell {
    private float centerX;
    private float centerY;
    private boolean selected;

    public Cell(float x, float y) {
        centerX = x;
        centerY = y;
    }

    public float getCenterX() {
        return centerX;
    }

    public void setCenterX(float centerX) {
        this.centerX = centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public void setCenterY(float centerY) {
        this.centerY = centerY;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}