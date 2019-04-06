import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public static void main(String[] args) {
         String Username = "Admin";
         String Temp="a";
        FileReader fw;
        {
            try {
                fw = new FileReader("C:\\Users\\aditya\\IdeaProjects\\Practise\\src\\Username.txt");
                for (;fw.read()!=-1; ) {

                    if (fw.read() == ' ') {
                        fw.close();
                    } else {
                        Temp = String.valueOf(fw.read());
                    }
                }
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
