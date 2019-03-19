import java.util.Scanner;

public class Math{
        public static void main(String[] args) {
                Scanner us = new Scanner(System.in);
                System.out.println("Enter a number to find its sum");
                int n1=us.nextInt();
                System.out.println("Enter limit");
                int n2=us.nextInt();

                int sum =n1;
                for(int i=0;i<=n2;i++)
                        sum =sum+i;

                System.out.println("Sum is"+sum);
                us.close();        

        }
}
            