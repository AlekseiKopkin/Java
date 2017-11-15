package com.company;

 class Square implements Figure{
    private Double perimeter;
    private Double area;
    private Double width;
    private Double height;
    public void Area(){
        area=width*height;
    }
    void setArea(double width,double height) {
        this.width=width;
        this.height=height;
    }
    double getArea(){
        Area();
        return  area;
    }
    public void Perimeter(){
        perimeter=2*(width+height);
    }
    void setPerimeter(Double width,Double height){
        this.width=width;
        this.height=height;
    }
    double getPerimeter(){
        return  perimeter;
    }

}
