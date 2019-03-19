import java.util.Scanner;

public class UserInput{

    public static void main(String[] args) {

        System.out.println("Enter two numbers to provide there sum");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); 
        int b = input.nextInt(); 
        int sum=a+b;
 
        System.out.println("Sum is "+sum);
        input.close();
    }
}