import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start spil");
        actions.add("2) options");
        actions.add("3) Pause");
        actions.add("4) slut");

        GameMenu gameMenu = new GameMenu(actions);
        int userChoice = gameMenu.getAction();

        doAction(userChoice);
    }

    public static void doAction(int action) {
        String[] messages = {
            "brrrrrrrrrrt",
            "skrrrrrrrrrrrrrrrrt",
            "frys",
            "You have Died"
        };

        if (action >= 1 && action <= messages.length) {
            System.out.println(messages[action - 1]);
        } else {
            System.out.println(" ;O    ");
        }
    }
}