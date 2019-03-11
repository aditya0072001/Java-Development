import java.util.Scanner;

public class Menu{

    public static void  menu(int choice){
        switch(choice){
             case 1: 
              System.out.println("hello");
              break;
             case 2:
                System.out.println("no");
                break;
             default:
                System.out.println("Oh that is illegal sending your details to CBI........");
                break;   
        }
    }
        public static void main(String[] args) {
                Scanner mn = new Scanner(System.in);
                System.out.println("Enter a choice");
                int ch= mn.nextInt();
                menu(ch);
                
        }
}
            