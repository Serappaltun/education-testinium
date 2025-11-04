package model.inheritance;

public class Worker {
    private int id;
    private String name;
    private int department;

    public Worker(int id, String name, int department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Worker() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
