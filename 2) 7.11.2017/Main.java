import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Interface inter = new Interface();
        Check check=new Check();
        out.print(" 1)Square\n 2)Rectangle\n 3)Triangle\n 4)Circle\n Enter the figure number: ");
        Scanner scanner = new Scanner(System.in);
        String coun = scanner.next();
        check.checkInt(coun);
        int count = Integer.parseInt(coun);
        switch (count) {
            case 1:
                inter.square();
                break;
            case 2:
                inter.rectangle();
                break;
            case 3:
                inter.triangle();
                break;
            case 4:
                inter.circle();
                break;
            default:
                out.println("ERROR");
                break;
        }
    }
}

class Interface {
    void square() { //Квадрат
        Square square = new Square();
        Check check = new Check();
        Scanner scanner = new Scanner(System.in);
        int count;
        double area, petimeter, width, height, coordinateX, coordinateY, coordinateX2, coordinateY2;
        String coun, coordX, coordY;
        out.print(" 1)Enter number\n 2)Input by coordinates\n Your choice: ");
        coun = scanner.next();
        check.checkInt(coun);
        count = Integer.parseInt(coun);
        switch (count) {
            case 1:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Enter the side size of the square: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        width = Double.parseDouble(coun);
                        height = Double.parseDouble(coun);
                        square.setArea(width, height);
                        square.Area();
                        area = square.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Enter the side size the square: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        width = Double.parseDouble(coun);
                        height = Double.parseDouble(coun);
                        square.setPerimeter(width, height);
                        square.Perimeter();
                        petimeter = square.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                        break;
                }
                break;
            case 2:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                ParameterCount parameterCount = new ParameterCount();
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        width = parameterCount.getCount();
                        height = parameterCount.getCount();
                        square.setArea(width, height);
                        square.Area();
                        area = square.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        width = parameterCount.getCount();
                        height = parameterCount.getCount();
                        square.setPerimeter(width, height);
                        square.Perimeter();
                        petimeter = square.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                        break;
                }
                break;
            default:
                out.println("ERROR");
                break;
        }
    }
    void rectangle() { //Прямоугольник
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        int count;
        double area, petimeter, width, height, coordinateX, coordinateY, coordinateX2, coordinateY2;
        String coun, coordX, coordY;
        out.print(" 1)Enter number\n 2)Input by coordinates\n Your choice: ");
        coun = scanner.next();
        check.checkInt(coun);
        count = Integer.parseInt(coun);
        switch (count) {
            case 1:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Enter the height of the rectangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        height = Double.parseDouble(coun);
                        out.print(" Enter the width of the rectangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        width = Double.parseDouble(coun);
                        rectangle.setArea(width, height);
                        rectangle.Area();
                        area = rectangle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Enter the height of the rectangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        height = Double.parseDouble(coun);
                        out.print(" Enter the width of the rectangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        width = Double.parseDouble(coun);
                        rectangle.setPerimeter(width, height);
                        rectangle.Perimeter();
                        petimeter = rectangle.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                        break;
                }
                break;
            case 2:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                ParameterCount parameterCount = new ParameterCount();
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        width = parameterCount.getCount();
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        height = parameterCount.getCount();
                        rectangle.setArea(width, height);
                        rectangle.Area();
                        area = rectangle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        width = parameterCount.getCount();
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        height = parameterCount.getCount();
                        rectangle.setPerimeter(width, height);
                        rectangle.Perimeter();
                        petimeter = rectangle.getPerimeter();
                        out.println(petimeter);
                    default:
                        out.println("ERROR");
                        break;
                }
                break;
            default:
                out.println("ERROR");
                break;
        }
    }
    void triangle() {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        int count;
        double area, petimeter, height, coordinateX, coordinateY, coordinateX2, coordinateY2,base, side1, side2, side3;
        String coun, coordX, coordY;
        out.print(" 1)Enter number\n 2)Input by coordinates\n Your choice: ");
        coun = scanner.next();
        check.checkInt(coun);
        count = Integer.parseInt(coun);
        switch (count) {
            case 1:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Enter the height of the triangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        height = Double.parseDouble(coun);
                        out.print(" Enter the base of the triangle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        base = Double.parseDouble(coun);
                        triangle.setArea(height, base);
                        triangle.Area();
                        area = triangle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Enter the side of the triangle ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        side1 = Double.parseDouble(coun);
                        out.print(" Enter the side of the triangle ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        side2 = Double.parseDouble(coun);
                        out.print(" Enter the side of the triangle ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        side3 = Double.parseDouble(coun);
                        triangle.setPerimeter(side1, side2, side3);
                        triangle.Perimeter();
                        petimeter = triangle.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                        break;
                }
            case 2:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                ParameterCount parameterCount = new ParameterCount();
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        base = parameterCount.getCount();
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        height = parameterCount.getCount();
                        triangle.setArea(height, base);
                        triangle.Area();
                        area = triangle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        side1 = parameterCount.getCount();
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        side2 = parameterCount.getCount();
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        side3 = parameterCount.getCount();
                        triangle.setPerimeter(side1, side2, side3);
                        triangle.Perimeter();
                        petimeter = triangle.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                }
                break;
            default:
                out.println("ERROR");
                break;
        }
    }
    void circle() {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        int count;
        double area, petimeter, radius, coordinateX, coordinateY, coordinateX2, coordinateY2;
        String coun, coordX, coordY;
        out.print(" 1)Enter number\n 2)Input by coordinates\n Your choice: ");
        coun = scanner.next();
        check.checkInt(coun);
        count = Integer.parseInt(coun);
        switch (count) {
            case 1:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Enter the radius of the circle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        radius = Double.parseDouble(coun);
                        circle.setArea(radius);
                        circle.Area();
                        area = circle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Enter the radius of the circle: ");
                        coun = scanner.next();
                        check.checkDouble(coun);
                        radius = Double.parseDouble(coun);
                        circle.setPerimeter(radius);
                        circle.Perimeter();
                        petimeter = circle.getPerimeter();
                        out.println(petimeter);
                        break;
                    default:
                        out.println("ERROR");
                        break;
                }
            case 2:
                out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
                ParameterCount parameterCount = new ParameterCount();
                coun = scanner.next();
                check.checkInt(coun);
                count = Integer.parseInt(coun);
                switch (count) {
                    case 1:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        radius = parameterCount.getCount();
                        circle.setArea(radius);
                        circle.Area();
                        area = circle.getArea();
                        out.println(area);
                        break;
                    case 2:
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX = Double.parseDouble(coordX);
                        out.print(" Value of Y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY = Double.parseDouble(coordY);
                        out.print(" Value of X coordinate: ");
                        coordX = scanner.next();
                        check.checkCoordinate(coordX);
                        coordinateX2 = Double.parseDouble(coordX);
                        out.print(" Value of y coordinate: ");
                        coordY = scanner.next();
                        check.checkCoordinate(coordY);
                        coordinateY2 = Double.parseDouble(coordY);
                        parameterCount.setCount(coordinateX, coordinateY, coordinateX2, coordinateY2);
                        parameterCount.Count();
                        radius = parameterCount.getCount();
                        circle.setPerimeter(radius);
                        circle.Perimeter();
                        petimeter = circle.getPerimeter();
                        out.println(petimeter);
                    default:
                        out.println("ERROR");
                        break;
                }
                break;
                default:
                    out.println("ERROR");
                    break;
        }
    }
}
class Check {
    int length;
    void checkDouble(String count) {
        length = count.length();
        if (length == 1) {
            if (count.charAt(0) < 48 || count.charAt(0) > 57) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        if (length != 1) {
            for (int i = 1; i < length; i++) {
                if ((count.charAt(i) != '.') && ((count.charAt(i) <48 ) || (count.charAt(i) >57))) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
            }
        }
    }
    void checkInt(String count) {
        length = count.length();
            if (length == 1) {
                if (count.charAt(0) < 49 || count.charAt(0) > 57) {
                    System.out.println("ERROR");
                    System.exit(0);
                }
            }
        if (length != 1) {
            System.out.println("ERROR");
            System.exit(0);
        }
    }
    void checkCoordinate(String count){
        for (int i = 1; i < length; i++) {
            if ((count.charAt(i) != '.') && ((count.charAt(i) <48 ) || (count.charAt(i) >57))) {
                System.out.println("ERROR");
                System.exit(0);
            }
        }
    }
}
class Square {
    private Double perimeter;
    private Double area;
    private Double width;
    private Double height;
    void Area(){
        area=width*height;
    }
    void setArea(Double width,Double height) {
        this.width=width;
        this.height=height;
    }
    Double getArea(){
        Area();
        return  area;
    }
    void Perimeter(){
        perimeter=2*(width+height);
    }
    void setPerimeter(Double width,Double height){
        this.width=width;
        this.height=height;
    }
    Double getPerimeter(){
        return  perimeter;
    }

}
class Rectangle{
    private Double perimeter;
    private Double area;
    private Double width;
    private Double height;
    void Area(){
        area=width*height;
    }
    void setArea(Double width,Double height) {
        this.width=width;
        this.height=height;
    }
    Double getArea(){
        return  area;
    }
    void Perimeter(){
        perimeter=2*(width+height);
    }
    void setPerimeter(Double width,Double height){
        this.width=width;
        this.height=height;
    }
    Double getPerimeter(){
        return  perimeter;
    }
}
class Triangle{
    private Double perimeter;
    private Double area;
    private Double height,base;
    private Double side1,side2,side3;
    void Area(){
        this.area=(0.5*height*base);
    }
    void setArea(Double height,Double base) {
        this.height=height;
        this.base=base;
    }
    Double getArea(){
        return  area;
    }
    void Perimeter(){
        this.perimeter=side1+side2+side3;
    }
    void setPerimeter(Double side1,Double side2,Double side3 ){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    Double getPerimeter(){
        return  perimeter;
    }
}
class Circle{
    private double perimeter,area,radius;
    void Area(){
        this.area=3.14*radius*radius;
    }
    void setArea(Double radius) {
        this.radius=radius;
    }
    Double getArea(){
        return  area;
    }
    void  Perimeter(){
     this.perimeter=2*3.14*radius;
    }
    void setPerimeter(Double radius){
        this.radius=radius;
    }
    Double getPerimeter(){
        return  perimeter;
    }
}
class ParameterCount{
    double count,coordinateX,coordinateY,coordinateX2,coordinateY2,count2;
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
                count = Math.sqrt(count2);
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
    void setCount (Double coordinateX,Double coordinateY,Double coordinateX2,Double coordinateY2){
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
        this.coordinateX2=coordinateX2;
        this.coordinateY2=coordinateY2;
    }
}