import java.util.Scanner;

public class PasswordVerify {


    public static void main(String[] args) {
        Scanner usr = new Scanner(System.in);
        System.out.println("Enter a Password(20 digits long) :");
        String password=usr.nextLine();
        int length=password.length();
        String[] passworddatabase = {"HelloWorld"};
        boolean compare =password.equals(passworddatabase);

         if(length < 20 && length > 0) {

             if(compare=true)
                System.out.println("Password sucessfully verified");
             else
                System.out.println("Password not verified");
            }
         else{
            System.out.println("Password not of valid length");
         }  
       usr.close();
    }
    
}