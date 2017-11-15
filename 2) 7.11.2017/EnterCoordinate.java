package com.company;

class EnterCoordinate {
    private Read read=new Read();
    private double [][] coordinate=new double[2][2];
    private Print print=new Print();
    double [][] Coordinate() {
        for (int i = 0; i < 1; i++) {
            print.EnterCoordinateX();
            coordinate[0][i] = read.ReadCoordinate();
            print.EnterCoordinateY();
            coordinate[1][i] = read.ReadCoordinate();
        }
        return coordinate;
    }
}
