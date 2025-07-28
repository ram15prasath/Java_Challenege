import java.io.File;
import java.io.FileWriter;

public class File_Writer {
    public static void main(String[] args) {
        try {
            File f=new File("Chumma.txt");
            FileWriter fw=new FileWriter(f);
            fw.write(" I am IronMan");
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
