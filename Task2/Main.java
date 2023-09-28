import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("gib name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("dav " + name + " din alder jeg må have");
        int age = scanner.nextInt();
        System.out.println("jeg kan forstå du er " + age + "år gammel");
        int yearsUntilRetirement = 69 - age;
        System.out.println("Din frihed kan findes om " + yearsUntilRetirement + " glhf");
    }
}
