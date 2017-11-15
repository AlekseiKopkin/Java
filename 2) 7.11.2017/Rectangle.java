package com.company;

 class Rectangle extends Square{
    private double perimeter;
    private double area;
    private double width;
    private double height;
    public void Area(){
        area=width*height;
    }
    void setArea(double width,double height) {
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return  area;
    }
    public void Perimeter(){
        perimeter=2*(width+height);
    }
    void setPerimeter(double width,double height){
        this.width=width;
        this.height=height;
    }
    double getPerimeter(){
        return  perimeter;
    }
}
