package characterstream3;

import java.util.Scanner;

public class LAB6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age : ");
        int age = input.nextInt();

        System.out.print("Enter Height : ");
        int H = input.nextInt();

        System.out.println(" ");
        System.out.println("Your infomation ->");

        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
        System.out.println("Height : "+H);
    }
}
