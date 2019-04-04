import java.util.Scanner;

public class CalculateLength{

        public static void  Reverse(String str){
                String rev = new StringBuffer(str).reverse().toString();
                System.out.println("String after reverse: "+rev);
               
        }      
        public static void main(String[] args) {
                Scanner us = new Scanner(System.in);
                System.out.println("Enter a String :");
                String str=us.nextLine();
                int length =str.length();
                System.out.println("Length is "+length);
                Reverse(str);  
                us.close();   
                System.out.println("Hello");

        }
}
      