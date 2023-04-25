package characterstream3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args){
        try{
            FileReader file =new FileReader("data.txt");
            Scanner input = new Scanner(file);
            System.out.println(input.nextLine());
            System.out.println(input.nextLine());

            String name = input.nextLine();
            int age = input.nextInt();
            Double wg = input.nextDouble();

            System.out.println(name);
            System.out.println(age);
            System.out.println(wg);

        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
