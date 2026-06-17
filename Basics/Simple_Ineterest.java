import java.util.Scanner;

public class Simple_Ineterest {
    public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter Principal amount: ");
     int P = sc.nextInt();
     System.out.println("Enter Rate of Interest: ");
     int R = sc.nextInt();
     System.out.println("Enter Time Period: ");
     float T = sc.nextFloat();
     float SI = (P*R*T)/100;
     System.out.println("Simple Interset= "+SI);
    }
}
