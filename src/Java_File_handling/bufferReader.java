package Java_File_handling;
import java.io.*;
// bufferedreader read line by line!
public class bufferReader {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("D:\\6. TEJAS\\SUBJECTS\\java_file_handling\\File_Reader\\file1.txt"));
        try{
            String i;
            while((i = br.readLine()) != null){
                System.out.println(i);
            }
        }
        finally {
            br.close();
        }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
