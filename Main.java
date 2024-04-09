import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Parallelepiped extends Shape {
    private double length;
    private double width;
    private double height;

    Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Rhombus extends Shape {
    private double side;
    private double height;

    Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return side * height;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
class Hexagon extends Shape
{
    private  double side1;

    Hexagon(double side1)
    {
     this.side1 = side1;
    }
    @Override
    double calculateArea(){
        return (3*Math.sqrt(3)*(side1*side1))/2;
    }
    @Override
    double calculatePerimeter(){
        return side1+side1+side1+side1+side1+side1;
    }
}

class Parallelogram extends Shape {
    private double side1osnovanie;
    private double side2;
    private double height;

    Parallelogram(double side1osnovanie, double side2, double height) {
        this.side1osnovanie = side1osnovanie;
        this.height = height;
        this.side2 = side2;

    }

    @Override
    double calculateArea() {
        return side1osnovanie*height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(side1osnovanie+side2);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру:");
        System.out.println("1. Круг");
        System.out.println("2. Квадрат");
        System.out.println("3. Прямоугольник");
        System.out.println("4. Параллелепипед");
        System.out.println("5. Ромб");
        System.out.println("6. Треугольник");
        System.out.println("7. Шестиугольник");
        System.out.println("8. Параллелограмм");
        int choice = scanner.nextInt();
        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Введите радиус круга: ");
                shape = new Circle(scanner.nextDouble());
                break;
            case 2:
                System.out.print("Введите длину стороны квадрата: ");
                shape = new Square(scanner.nextDouble());
                break;
            case 3:
                System.out.print("Введите значения сторон прямоугольника через пробел: ");
                shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                break;
            case 4:
                System.out.print("Введите длину, ширину и высоту параллелепипеда через пробел: ");
                shape = new Parallelepiped(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                break;
            case 5:
                System.out.print("Введите значения сторон ромба через пробел: ");
                shape = new Rhombus(scanner.nextDouble(), scanner.nextDouble());
                break;
            case 6:
                System.out.print("Введите длины трех сторон треугольника через пробел: ");
                shape = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                break;
            case 7:
                System.out.print("Введите длину стороны шестиугольника: ");
                shape = new Hexagon(scanner.nextDouble());
                break;
            case 8:
                System.out.print("Введите длину основания высоты и ширины параллелаграмма через пробел: ");
                shape = new Parallelogram(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }

        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Периметр: " + shape.calculatePerimeter());
    }
}
