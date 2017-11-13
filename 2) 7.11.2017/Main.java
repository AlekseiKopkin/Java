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
    void square() {
        Square square = new Square();
        Check check=new Check();
        Double area, petimeter, width, height;
        out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
        Scanner scanner = new Scanner(System.in);
        String coun = scanner.next();
        check.checkInt(coun);
        int count = Integer.parseInt(coun);
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
    }
    void rectangle() {
        Rectangle rectangle = new Rectangle();
        Check check=new Check();
        Double area, petimeter, width, height;
        out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
        Scanner scanner = new Scanner(System.in);
        String coun = scanner.next();
        check.checkInt(coun);
        int count = Integer.parseInt(coun);
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
    }
    void triangle(){
        Triangle triangle = new Triangle();
        Check check=new Check();
        Double area, petimeter, base, height,side1,side2,side3;
        out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
        Scanner scanner = new Scanner(System.in);
        String coun = scanner.next();
        check.checkInt(coun);
        int count = Integer.parseInt(coun);
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
                triangle.setArea(height,base);
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
                triangle.setPerimeter(side1,side2,side3);
                triangle.Perimeter();
                petimeter = triangle.getPerimeter();
                out.println(petimeter);
                break;
            default:
                out.println("ERROR");
                break;
        }
    }
    void circle(){
        Circle circle = new Circle();
        Check check =new Check();
        Double area, petimeter,radius; ;
        out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
        Scanner scanner = new Scanner(System.in);
        String coun = scanner.next();
        check.checkInt(coun);
        int count = Integer.parseInt(coun);
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