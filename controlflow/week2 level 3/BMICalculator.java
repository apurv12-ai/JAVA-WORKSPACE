import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        height = height / 100; // Convert cm to meters
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f\n", bmi);
        if (bmi < 18.4)
            System.out.println("Status: Underweight");
        else if (bmi <= 24.9)
            System.out.println("Status: Normal");
        else if (bmi <= 39.9)
            System.out.println("Status: Overweight");
        else
            System.out.println("Status: Obese");
        sc.close();
    }
}