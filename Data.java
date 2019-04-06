import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {
         String Username = "Admin"; //Username for comparision
         String Temp="a"; //Temp for storing value read from file
        FileReader fw;
        {
            try {
                fw = new FileReader("C:\\Users\\aditya\\IdeaProjects\\Practise\\src\\Username.txt"); //Opening the file
               
                for (;fw.read()!=-1; ) {

                        Temp = String.valueOf(fw.read());
                    }
                }
                if (Username.equals(Temp)) {
                    System.out.println("Verified");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
