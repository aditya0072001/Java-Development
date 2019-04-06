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

                while((Line=bw.readline())!=null){
                    System.out.println(Line);
                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
