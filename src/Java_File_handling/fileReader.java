package Java_File_handling;
import java.io.*;
public class fileReader {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("D:\\6. TEJAS\\SUBJECTS\\java_file_handling\\File_Reader\\file1.txt");

        try{
            int i;
            while((i=r.read())!=-1)
            {
               // System.out.print(i); // here ascii value will get print
                System.out.print((char)i); // will do type casting
            }
        }
        finally {
            r.close();
        }
        }

        catch (IOException e){
            System.out.println(e);
        }
    }
}
