/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhchunhat;

/**
 *
 * @author suckm
 */
public class Rectangle {
    private double width;
    private double height;
    private String color;
    
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width,double height,String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }
    
    
    public void setColor(String color) {
        String temp = color.toLowerCase();
        String cap = temp.substring(0, 1).toUpperCase() + temp.substring(1);
        this.color = color;
    }
    
    public double findArea(){
        return this.width * this.height;
    }
    
    public double findPerimeter(){
        return 2*(this.width + this.height);
    }
    
}
