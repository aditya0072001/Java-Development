import java.util.Scanner;

public class PasswordVerify {


    public static void main(String[] args) {
        Scanner usr = new Scanner(System.in);
        boolean compare =false;
        do{ //Repeats untill compare value is true
        System.out.println("Enter a Password(20 digits long) :");
        String password=usr.nextLine();
        int length=password.length();
        String passworddatabase = new String("HelloWorld");
        compare =password.equals(passworddatabase); //compare with password database

         if(length < 20 && length > 0) { //Length comparision

             if(compare==true)
                System.out.println("Password sucessfully verified");
             else
                System.out.println("Password not verified");
            }
         else{
            System.out.println("Password not of valid length");
         }
      }while(compare!=true);  
       usr.close();
    }
    
}