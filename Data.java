import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {
        String Username = "Admin1";
        String Temp="";
        String Line="";
        int ch;
        FileReader fw;
        BufferedReader bw;
        {
            try {
                bw= new BufferedReader(new FileReader("C:\\Users\\aditya\\IdeaProjects\\Practise\\src\\Username.txt"));

                while((Line=bw.readLine())!=null){
                    System.out.println(Line);

                   if(Username.equals(Line)){
                       System.out.println("Verified");
                       break;
                   }
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
