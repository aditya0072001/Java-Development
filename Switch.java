import java.util.Scanner;  
public class Switch
{ 
    void  menu(int choice){
        switch (choice)
        {
            case '1':
                System.out.println("Enter a choice");    
        }
    }
    public static void main(String[] argv)
    {   
        Scanner input = new Scanner(System.in);
        int i=input.nextInt();
        menu(i);

    }    
}    