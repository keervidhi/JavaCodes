//Print the sum of first n Natural Numbers.

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Addition of n natural numbers: "+ sum);
    }    
}
