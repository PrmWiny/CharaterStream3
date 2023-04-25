package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("Data.txt");
            output.write("Hello World");
            output.write("Welcome to Java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
        }   catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static class LAB3 {
        public static void main(String[] args) {
            try {
                PrintWriter output = new PrintWriter("Data.txt");
                output.println("Hello World");
                output.println("Welcome to Java");
                output.println("Harry Potter");
                output.println(19);
                output.println(60.5);
                output.println(175.0);
                output.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
