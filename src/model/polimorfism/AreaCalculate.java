package model.polimorfism;

public class AreaCalculate {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(1.5, 1.5);
        double rectangleArea = rectangle.areaCalculate();
        Shape square = new Square(2);
        double squareArea = square.areaCalculate();
    }
}
