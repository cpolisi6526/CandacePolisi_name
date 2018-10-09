package candacepolisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to me you");
        System.out.println("how old are you?");
        int age= input.nextInt();
        if (age!=12) {
            System.out.println("damn " + name + " you're " + age + " I thought you were about 12");
        }
        else{
            System.out.println("cool cool 12 is a cool age.");
        }
    }
}
