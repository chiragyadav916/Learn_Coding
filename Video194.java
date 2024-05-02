import java.io.FileInputStream;
import java.io.FileOutputStream;

//copy file content from Video193.txt to Video194.txt
public class Video194 {
    public static void main(String[] args) throws Exception{
        FileInputStream r = new FileInputStream("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video193.txt");
        FileOutputStream w = new FileOutputStream("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video194.txt");
        int i;
        while ((i = r.read()) != -1) {
            w.write(i);
        }
        System.out.println("File copied successfully");
    }
}
