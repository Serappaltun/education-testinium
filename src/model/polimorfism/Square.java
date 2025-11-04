package model.polimorfism;

public class Square implements Shape {
    private double kenar;

    public Square(double kenar) {
        this.kenar = kenar;
    }
    @Override
    public double areaCalculate() {
        return kenar * kenar;
    }
}
