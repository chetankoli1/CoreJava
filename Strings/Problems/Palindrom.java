package Strings.Problems;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String n = sc.next();

       StringBuilder sb = new StringBuilder(n);
       String c = sb.reverse().toString();
       if (n.equals(c)) {
        System.out.println("Yes");
       } else {
        System.out.println("No");
       }
       sc.close();
    }
}
