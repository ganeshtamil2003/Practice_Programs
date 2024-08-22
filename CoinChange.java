import java.util.Scanner;

class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of coins: ");
        int numCoins = sc.nextInt();
        int[] coins = new int[numCoins];
        System.out.print("Coins: ");
        for (int i = 0; i < numCoins; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Amount: ");
        int amount = sc.nextInt();

        // Call the function to print all combinations
        System.out.println("Combinations:");
        printCombinations(coins, numCoins, amount, "", 0);
    }

    // Function to print all combinations
    static void printCombinations(int[] coins, int numCoins, int amount, String combination, int index) {
        if (amount == 0) {
            System.out.println(combination);
            return;
        }

        if (amount < 0) {
            return;
        }

        for (int i = index; i < numCoins; i++) {
            printCombinations(coins, numCoins, amount - coins[i], combination + (combination.isEmpty() ? "" : "+") + coins[i], i);
        }
    }
}
