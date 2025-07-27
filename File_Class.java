import java.util.*;
import java.io.*;
public class File_Class {
    public static void main(String[] args) {
        try {
            File f=new File("Chumma.txt");
            Scanner scan=new Scanner(f);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
