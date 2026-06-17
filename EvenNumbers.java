//Print all even numbers till n.
import java.util.Scanner;
public class EvenNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("All even numbers till your entered number:");
        for(int i = 0; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}

