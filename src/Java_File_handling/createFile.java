package Java_File_handling;
import java.io.*;
public class createFile {               // for with-out try-catch block use "throws" keyword
    public static void main(String[] args) /* throws IOException, InterruptedException  */ {
       File f = new File("D:\\6. TEJAS\\SUBJECTS\\Files\\first2.txt");
//        File f = new File( "D:\\6. TEJAS\\SUBJECTS\\java_file_handling\\File_Reader\\file1.txt");

        try {
            {
                if (f.exists()) {
                    System.out.println("File already exits ...");
                    Thread.sleep(2000);
                    System.out.println("deleting older file, wait 2sec");
                    Thread.sleep(2000);
                    f.delete();
                    System.out.println("File Deleted");
                }
                Thread.sleep(2000);
                System.out.println("Creating New File, Wait 2sec");

                Thread.sleep(2000);
                f.createNewFile();
                System.out.println("File created ...");
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception Handled");
        } catch (InterruptedException e) { //e is an object (reference variable) of class InterruptedException
            System.out.println(e); //prints exception
            System.out.println(e.getMessage()); //message
            e.printStackTrace(); // full error details
            System.out.println("Sleep Interrupted");
            //asa nhi ahe ki kahi lihilach pahijet okay! asa karun pun sodu shakto like- catch(IOException e){}
        }
    }


}
