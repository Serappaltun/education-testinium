import model.constructor.Car;
import model.inheritance.SoftwareWorker;

public class Default {
    public static void main(String[] args) {
        Car car4 = new Car();
        car4.setModel("mercedes");
        car4.setModel("volvo");
        String model = car4.getModel(); //volvo
        for (int i = 0; i < model.length(); i++) {
            if ("mercedes".equals(model)) {
                continue;
            }
        }

        SoftwareWorker softwareWorker = new SoftwareWorker();
        softwareWorker.setId(1);
        softwareWorker.setName("Software Worker");
        softwareWorker.setProgramingLanguage("JAVA");
    }
}