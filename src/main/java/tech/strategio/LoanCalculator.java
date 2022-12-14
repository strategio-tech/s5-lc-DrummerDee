package tech.strategio;
import java.util.Scanner;

public class LoanCalculator {
    /**
     * Receives amount and iterate by the amount of months (3).
     *  Method takes amount as the input.
     * @return / Returns loan amount.
     */

    static int getRemainingAmountIn3Months(int amount) {
        int months = 3;
        int remainder ;
        for(int x = 0; x < months; x++){
            remainder = amount - amount/10;
            amount = remainder;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }

    }
}
