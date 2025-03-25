/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>

Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter number "+(i+1)+" : ");
            arr[i] = scn.nextInt();
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println("Number is positive and even");
                }
                else{
                    System.out.println("Number is positive and odd");
                }
            }
            else if(arr[i]<0){
                System.out.println("Number is negative");
            }
            else{
                System.out.println("Number is zero");
            }
        }
        if(arr[0]==arr[4]){
            System.out.println("First and last element are equal");
        }
        else if(arr[0]>arr[4]){
            System.out.println("First element is greater than last element");
        }
        else{
            System.out.println("First element is less than last element");
        }
    }
    
}
