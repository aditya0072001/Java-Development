import java.util.Scanner;

public class StringOperation{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string\t:");
        String a = input.nextLine(); 
        int lengthstr=a.length();
        System.out.println(a);
        System.out.println(lengthstr);
        System.out.println(a.length());
        input.close();
    }
}