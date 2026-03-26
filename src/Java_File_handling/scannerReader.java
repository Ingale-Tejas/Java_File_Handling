package Java_File_handling;
import java.io.*;
import java.util.Scanner;
public class scannerReader {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\6. TEJAS\\SUBJECTS\\java_file_handling\\File_Reader\\file1.txt");
            Scanner sc = new Scanner(f);
            try{
                    while(sc.hasNextLine()){
                        System.out.println(sc.nextLine()); //ye print karte rhega
                    }
            }
            finally {
                sc.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e); // this will convert check to unchecked
                                            // runtimeException is unchecked --
        }
    }
}
