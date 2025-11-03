import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adı:");
        String username = scanner.nextLine();
        System.out.println("Parola:");
        String password = scanner.nextLine();
        if ("admin".equalsIgnoreCase(username) && "1234".equals(password)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Hatalı giriş!");
        }
    }
}