package com.company;

class UserInterface {
    private Read read = new Read();
    private Print print = new Print();
    private double coordinate[][] = new double[2][2];
    private EnterCoordinate enterCoordinate = new EnterCoordinate();
    private ParameterCount parameterCount = new ParameterCount();

    void Interface() {
        print.ChoiceFigure();
        int count = read.ReadInt();
        switch (count) {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                triangle();
                break;
            case 4:
                circle();
                break;
            default:
                print.Error();
                break;
        }
    }

    private void square() { //Квадрат
        Square square = new Square();
        int count;
        double area, valueHand, perimeter;
        print.ChoiceInputData();
        count = read.ReadInt();
        switch (count) {
            case 1:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        print.SideSize();
                        valueHand = read.ReadDouble();
                        square.setArea(valueHand, valueHand);
                        square.Area();
                        area = square.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        print.SideSize();
                        valueHand = read.ReadDouble();
                        square.setPerimeter(valueHand, valueHand);
                        square.Perimeter();
                        perimeter = square.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            case 2:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        coordinate = enterCoordinate.Coordinate();
                        parameterCount.setCount(coordinate);
                        parameterCount.Count();
                        valueHand = parameterCount.getCount();
                        square.setArea(valueHand, valueHand);
                        square.Area();
                        area = square.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        coordinate = enterCoordinate.Coordinate();
                        parameterCount.setCount(coordinate);
                        parameterCount.Count();
                        valueHand = parameterCount.getCount();
                        square.setPerimeter(valueHand, valueHand);
                        square.Perimeter();
                        perimeter = square.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            default:
                print.Error();
                break;
        }
    }

    private void rectangle() { //Прямоугольник
        Rectangle rectangle = new Rectangle();
        int count;
        double area, perimeter;
        double valueHand[] = new double[2];
        print.ChoiceInputData();
        count = read.ReadInt();
        switch (count) {
            case 1:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            print.SideSize();
                            valueHand[i] = read.ReadDouble();
                        }
                        rectangle.setArea(valueHand[0], valueHand[1]);
                        rectangle.Area();
                        area = rectangle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            print.SideSize();
                            valueHand[i] = read.ReadDouble();
                        }
                        rectangle.setPerimeter(valueHand[0], valueHand[1]);
                        rectangle.Perimeter();
                        perimeter = rectangle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            case 2:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            coordinate = enterCoordinate.Coordinate();
                            parameterCount.setCount(coordinate);
                            parameterCount.Count();
                            valueHand[i] = parameterCount.getCount();
                        }
                        rectangle.setArea(valueHand[0], valueHand[1]);
                        rectangle.Area();
                        area = rectangle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            coordinate = enterCoordinate.Coordinate();
                            parameterCount.setCount(coordinate);
                            parameterCount.Count();
                            valueHand[i] = parameterCount.getCount();
                        }
                        rectangle.setPerimeter(valueHand[0], valueHand[1]);
                        rectangle.Perimeter();
                        perimeter = rectangle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            default:
                print.Error();
                break;
        }
    }

    private void triangle() {
        Triangle triangle = new Triangle();
        int count;
        double area, perimeter;
        double valueHand[] = new double[3];
        print.ChoiceInputData();
        count = read.ReadInt();
        switch (count) {
            case 1:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            print.SideSize();
                            valueHand[i] = read.ReadDouble();
                        }
                        triangle.setArea(valueHand[0], valueHand[1]);
                        triangle.Area();
                        area = triangle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++) {
                            print.SideSize();
                            valueHand[i] = read.ReadDouble();
                        }
                        triangle.setPerimeter(valueHand[0], valueHand[1], valueHand[2]);
                        triangle.Perimeter();
                        perimeter = triangle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
            case 2:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            coordinate = enterCoordinate.Coordinate();
                            parameterCount.setCount(coordinate);
                            parameterCount.Count();;
                            valueHand[i] = parameterCount.getCount();
                        }
                        triangle.setArea(valueHand[0], valueHand[1]);
                        triangle.Area();
                        area = triangle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        for (int i = 0; i < 2; i++) {
                            coordinate = enterCoordinate.Coordinate();
                            parameterCount.setCount(coordinate);
                            parameterCount.Count();
                            valueHand[i] = parameterCount.getCount();
                        }
                        triangle.setPerimeter(valueHand[0], valueHand[1], valueHand[2]);
                        triangle.Perimeter();
                        perimeter = triangle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            default:
                print.Error();
                break;
        }
    }

    private void circle() {
        Circle circle = new Circle();
        int count;
        double area, perimeter;
        double valueHand;
        print.ChoiceInputData();
        count = read.ReadInt();
        switch (count) {
            case 1:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        print.SideSize();
                        valueHand = read.ReadDouble();
                        circle.setArea(valueHand);
                        circle.Area();
                        area = circle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        print.SideSize();
                        valueHand = read.ReadDouble();
                        circle.setPerimeter(valueHand);
                        circle.Perimeter();
                        perimeter = circle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
            case 2:
                print.ChoiceSearch();
                count = read.ReadInt();
                switch (count) {
                    case 1:
                        coordinate = enterCoordinate.Coordinate();
                        parameterCount.setCount(coordinate);
                        parameterCount.Count();
                        parameterCount.Count();
                        valueHand = parameterCount.getCount();
                        circle.setArea(valueHand);
                        circle.Area();
                        area = circle.getArea();
                        print.EnterValue(area);
                        break;
                    case 2:
                        coordinate = enterCoordinate.Coordinate();
                        parameterCount.setCount(coordinate);
                        parameterCount.Count();
                        valueHand = parameterCount.getCount();
                        circle.setPerimeter(valueHand);
                        circle.Perimeter();
                        perimeter = circle.getPerimeter();
                        print.EnterValue(perimeter);
                        break;
                    default:
                        print.Error();
                        break;
                }
                break;
            default:
                print.Error();
                break;
        }
    }
}