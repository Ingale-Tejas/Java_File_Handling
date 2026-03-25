package Java_File_handling;
import java.io.File;
import java.io.IOException;

public class fileInfo {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\6. TEJAS\\SUBJECTS\\Files\\file_info.txt");

        f.createNewFile();

        if (f.exists()){
            System.out.println("File Exists !!!");
            System.out.println("File Name: " + f.getName());
            System.out.println("File Path: " + f.getPath());
            System.out.println("File Location: " + f.getAbsolutePath());
            System.out.println("File Size: " + f.length());
            System.out.println("File Readable ?: " + f.canRead());
            System.out.println("File Writable ? " + f.canWrite());
            System.out.println("File Excutable ?: " + f.canExecute());
            System.out.println("isFile: " + f.isFile());
            System.out.println("isDirectory: " + f.isDirectory());
           // f.delete();
        }
        else {
            System.out.println("File Already Exists !!!");
        }
    }
}
