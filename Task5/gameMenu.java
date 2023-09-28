import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
    private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu() {
        System.out.println("Type a number to choose an action:");
        for (String action : actions) {
            System.out.println(action);
        }
    }

    public int getAction() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;
    }
}