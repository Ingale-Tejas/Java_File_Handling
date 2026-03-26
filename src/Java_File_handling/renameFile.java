package Java_File_handling;
import java.io.*;
public class renameFile {
    public static void main(String[] args) throws IOException{

        File f = new File("D:\\6. TEJAS\\SUBJECTS\\Files\\first2.txt");
        File r = new File("D:\\6. TEJAS\\SUBJECTS\\Files\\renamed_file.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
            System.out.println("File renamed successfully");
        }
        else {
            System.out.println("File does not exist");
        }

    }
}
