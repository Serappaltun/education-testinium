package model.abstractions;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public void sleep() {
        System.out.println(name + "Sleeping...");
    }
}
