/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */

import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Options are\n 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo or Remainder\nEnter option: ");
        int option = sc.nextInt();
        /*switch (option) {
            case 1:
                System.out.println("Addition of a and b: "+(a+b));
                break;

            case 2:
                System.out.println("Subtraction of a and b: "+(a-b));
                break;

            case 3:
                System.out.println("Multiplication of a and b: "+(a*b));
                break;

            case 4:
                System.out.println("Division of a and b: "+(a/b));
                break;

            case 5:
                System.out.println("Modulo or remainder of a and b: "+(a%b));
                break;

            default:
                System.out.println("Invalid Option");    
                break;
        }*/
       if (option==1) {
        System.out.println("Addition of a and b: "+(a+b));
       }
       else if (option==2) {
         System.out.println("Subtraction of a and b: "+(a-b));        
       }
       else if (option==3) {
        System.out.println("Multiplication of a and b: "+(a*b));
       }
       else if (option==4) {
        System.out.println("Division of a and b: "+(a/b));
       }
       else if (option==5) {
                        System.out.println("Modulo or remainder of a and b: "+(a%b));
       }
       else{
        System.out.println("Invalid Option");  
       }
    }
}
