import java.util.Scanner;

public class StringOperation{

    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String a[] = input.nextString(); 
        int b = input.nextInt(); 
        int sum=a+b;
 
        System.out.println("Sum is "+sum);
    }
}