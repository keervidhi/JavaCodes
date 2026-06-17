//Make a program that prints the table of a number that is input by the user. 
//(HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no= ");
        int num = sc.nextInt();

        /*System.out.print("Table of "+num+" is \n"+(num*1)+
        "\n"+(num*2)+
        "\n"+(num*3)+
        "\n"+(num*4)+
        "\n"+(num*5)+
        "\n"+(num*6)+
        "\n"+(num*7)+
        "\n"+(num*8)+
        "\n"+(num*9)+
        "\n"+(num*10));*/
        System.out.println("Table of "+num+" is");
        for(int i = 1; i < 11; i++){
            System.out.println(num*i);
        }
    }
    
}
