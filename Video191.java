//write in file- Video189.txt

import java.io.*;

public class Video191 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video191.txt");
            try {
                fw.write("Chirag Yadav");
            } finally {
                fw.close();
                System.out.println("File closed");
            }
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
    }
}
