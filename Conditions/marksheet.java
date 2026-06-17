/*Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */

import java.util.Scanner;

public class marksheet {
    public static void main(String args[]){
        //System.out.println("Enter 1 to show");
        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Enter 1 to input marks or to stop enter 0: ");
            num = sc.nextInt();

            if(num==1){
                System.out.println("Enter student marks out of 100: ");
                int marks = sc.nextInt();

                if(marks>=90 && marks<=100){
                    System.out.println("This is good.");
                }
                else if(marks>=60 && marks<=89){
                    System.out.println("This is also good.");
                }
                else if(marks>=0 && marks<=59){
                    System.out.println("This is good as well.");
                }
                else{
                    System.out.println("Invalid marks!");
                }
                System.out.println("Because marks don’t matter but our effort does.");
            }
            else if(num!=0){
                System.out.println("Invalid choice! Enter only 1 or 0.");
            }
        }while(num != 0);

        System.out.println("Program stopped");
        sc.close();
    }
}
