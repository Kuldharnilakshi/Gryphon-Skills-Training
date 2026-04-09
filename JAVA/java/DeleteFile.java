import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File ff=new File("C:\\Users\\nilak\\OneDrive\\Desktop\\Samplefile.txt");
        if (ff.delete()) {
            System.out.println("Deleted the file: " + ff.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
