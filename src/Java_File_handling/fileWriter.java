package Java_File_handling;
import java.io.*;

public class fileWriter {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("D:\\6. TEJAS\\SUBJECTS\\Files\\file_write.txt");
            try{
                f.write("Hello Bhai");
            }
            finally{
                f.close();
            }
            System.out.println("File Successfully written");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

//using BufferedWriter
// package Java_File_handling;
//import java.io.*;
//
//public class fileWriter {
//    public static void main(String[] args) {
//        try {
//            BufferedWriter bw = new BufferedWriter(
//                    new FileWriter("D:\\6. TEJAS\\SUBJECTS\\Files\\file_write.txt")
//            );
//
//            bw.write("Hello Bhai");
//
//            bw.close();
//
//            System.out.println("File Successfully written (BufferedWriter)");
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//}
//using FileOutputStream
