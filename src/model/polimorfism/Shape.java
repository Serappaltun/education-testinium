package model.polimorfism;

public interface Shape {
    double areaCalculate();

    default double volumeCalculate() {
        return areaCalculate();
    }
}
