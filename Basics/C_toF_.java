import java.util.Scanner;
import java.util.scanner;
public class C_toF_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius*1.8)+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
    }    
}
