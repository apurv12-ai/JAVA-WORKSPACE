/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>

Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___ */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scn.nextInt();
        int[] multiplication_table = new int[4];
        for(int i=0;i<4;i++){
            multiplication_table[i] = number*(i+6);
            System.out.println(number+" * "+(i+6)+" = "+multiplication_table[i]);
        }
    }
}
