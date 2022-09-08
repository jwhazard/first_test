import java.util.Scanner;

public class MyInfoApp {
    public static void main(String[] args) {
        System.out.print("name, city, age, weight, single: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("name is " + name);

        String city = scanner.next();
        System.out.println("city is " + city);

        scanner.close();
    }
}
