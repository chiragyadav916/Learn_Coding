//read data from file Video191.txt

import java.io.*;

public class Video192 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\_New folder\\Codes\\Java Programs (intellij)\\Learn Coding\\src\\Video191.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
                System.out.println("\nFile closed");
            }
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
