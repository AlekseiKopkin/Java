package com.company;

class ParameterCount{
    private double count,coordinateX,coordinateY,coordinateX2,coordinateY2,count2;
    void Count () {
        if(coordinateX==coordinateX2){
            if(coordinateY>coordinateY2){
                count=coordinateY-coordinateY2;
            }else{
                count=coordinateY2-coordinateY;
            }
        }
        if(coordinateY==coordinateY2){
            if(coordinateX>coordinateX2){
                count=coordinateX-coordinateX2;
            }else{
                count=coordinateX2-coordinateX;
            }
        }
        if (coordinateX < coordinateX2) {
            if (coordinateY < coordinateY2) {
                count2 = (Math.pow(coordinateX2 - coordinateX, 2) + Math.pow(coordinateY2 - coordinateY, 2));
                count = Math.sqrt(this.count2);
            }
        }
        if (coordinateX2 > coordinateX) {
            if (coordinateY > coordinateY2) {
                count2 = (Math.pow(coordinateX2 - coordinateX, 2) + Math.pow(coordinateY - coordinateY2, 2));
                count = Math.sqrt(count2);
            }
        }
        if (coordinateX > coordinateX2) {
            if (coordinateY2 > coordinateY) {
                count2 = (Math.pow(coordinateX - coordinateX2, 2) + Math.pow(coordinateY2 - coordinateY, 2));
                count = Math.sqrt(count2);
            }
        }
        if (coordinateX > coordinateX2) {
            if (coordinateY > coordinateY2) {
                count2 = (Math.pow(coordinateX - coordinateX2, 2) + Math.pow(coordinateY - coordinateY2, 2));
                count = Math.sqrt(count2);
            }
        }
    }
    Double getCount(){
        return count;
    }
    void setCount (double [][] coordinate){
        this.coordinateX=coordinate[0][0];
        this.coordinateY=coordinate[1][0];
        this.coordinateX2=coordinate[0][1];
        this.coordinateY2=coordinate[1][1];
    }
}
