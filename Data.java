import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {
         String Username = "Admin1";
         String Temp=" ";
        FileReader fw;
        {
            try {
                fw = new FileReader("C:\\Users\\aditya\\IdeaProjects\\Practise\\src\\Username.txt");

                for (; fw.read() != -1; ) {

                    Temp+= String.valueOf((char)fw.read());
                    System.out.println(Temp);

                }
                    fw.close();
                if (Username.equals(Temp)) {
                    System.out.println("Verified");

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
