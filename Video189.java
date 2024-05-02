//create a file in the src folder called Video189.txt

import java.io.*;

public class Video189 {
    public static void main(String[] args) {
        File f = new File("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video189.txt");
        try {
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            System.out.println("Exception handled");
        }

    }
}
