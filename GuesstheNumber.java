import java.util.*;

class GuesstheNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int guess = (int) (Math.random() * 101); // Random number between 0 and 100 (inclusive)
        int attempts = 5;

        System.out.println("** Guess the Number within 5 Guesses **");
        System.out.println("Enter a number between 0 and 100:");

        while (attempts > 0) {
            int number = sc.nextInt();

            // Validate input range
            if (number < 0 || number > 100) {
                System.out.println("Invalid input! Please enter a number between 0 and 100.");
                continue;
            }

            if (number == guess) {
                System.out.println("Congratulations! You've guessed the number correctly.");
                break;
            } else if (number > guess) {
                System.out.println("You've entered a number greater than the answer.");
            } else {
                System.out.println("You've entered a number lesser than the answer.");
            }

            attempts--;
            if (attempts > 0) {
                System.out.println(attempts + " guess(es) left.");
            } else {
                System.out.println("Better luck next time!");
                System.out.println("The correct number was: " + guess);
            }
        }

        sc.close(); // Close the scanner
    }
}
