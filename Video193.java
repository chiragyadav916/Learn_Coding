//rename a file Video191.txt to Video193.txt
import java.io.*;
public class Video193 {
    public static void main(String[] args) {
        File oldName = new File("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video191.txt");
        File newName = new File("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video193.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Error renaming file");
        }
    }
}
