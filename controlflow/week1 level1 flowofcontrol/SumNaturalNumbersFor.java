import java.util.Scanner;
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            int sumFormula = (n * (n + 1)) / 2;
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumLoop == sumFormula) {
                System.out.println("Both results match!");
            } else {
                System.out.println("There is an error in the calculation.");
            }
        }
        sc.close();
    }
}