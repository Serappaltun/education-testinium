package model.polimorfism;

public class Rectangle implements Shape {
    private double uzunluk;
    private double genislik;

    public Rectangle(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double areaCalculate() {
        return uzunluk * genislik;
    }
}
