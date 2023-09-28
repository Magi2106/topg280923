import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
    
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


   private static void makeAGuess() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Gæt et tal! ");

            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();

                if (userGuess < rnd_number) {
                    System.out.println("Du er nede i den fokerte kælder.");
                } else if (userGuess > rnd_number) {
                    System.out.println("Du er oppe på det fokerte tag.");
                } else {
                    System.out.println("BINGO DU HAR VUNDET EN TUR TIL BORNHOLM FEATURING DIT NUMMER " + rnd_number);
                    break;
                }
            } else {
                System.out.println("Nixen bixen karen blixen");
                scanner.next();
            }
        } while (true);

      
    }
}

