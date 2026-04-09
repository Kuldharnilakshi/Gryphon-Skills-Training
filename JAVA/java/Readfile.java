
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) throws FileNotFoundException {
        File ff=new File("C:\\Users\\nilak\\OneDrive\\Desktop\\New Text Document.txt");
        Scanner sc= new Scanner(ff);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}
