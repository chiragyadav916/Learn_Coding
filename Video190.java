import java.io.File;

//File Information of Video189.txt
public class Video190 {
    public static void main(String[] args) {
        File f = new File("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video189.txt");
        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
            System.out.println("File Deleted: " + f.delete());
        } else
            System.out.println("File does not exist");
    }
}
