package Strings;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if (n%400 == 0) {
        System.out.println(true);
       }

       else if (n%100 == 0) {
        System.out.println(false);
       }

       else if (n%4 == 0) {
        System.out.println(true);
       }

       else {
        System.out.println(false);
       }
       sc.close();
    }
}
