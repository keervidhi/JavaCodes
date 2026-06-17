//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user
import java.util.Scanner;
class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = sc.nextFloat();
        double area = 3.14*r*r; 
        System.out.println("Enter area of circle: "+area);
        
    }
}