package com.company;

public class Triangle implements Figure{
    private double perimeter,area,height,base,side1,side2,side3;
    public void Area(){
        this.area=(0.5*height*base);
    }
    void setArea(double height,double base) {
        this.height=height;
        this.base=base;
    }
    double getArea(){
        return  area;
    }
    public void Perimeter(){
        this.perimeter=side1+side2+side3;
    }
    void setPerimeter(double side1,double side2,double side3 ){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    double getPerimeter(){
        return  perimeter;
    }
}
