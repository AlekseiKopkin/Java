package com.company;

class Circle implements Figure{
    private double perimeter,area,radius;
    public void Area(){
        this.area=3.14*radius*radius;
    }
    void setArea(double radius) {
        this.radius=radius;
    }
    double getArea(){
        return  area;
    }
    public void  Perimeter(){
        this.perimeter=2*3.14*radius;
    }
    void setPerimeter(Double radius){
        this.radius=radius;
    }
    double getPerimeter(){
        return  perimeter;
    }
}
