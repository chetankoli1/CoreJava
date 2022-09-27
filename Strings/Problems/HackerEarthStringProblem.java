package Strings.Problems;

import java.util.Scanner;

public class HackerEarthStringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.trim();
        if (str.length() == 0) {
            System.out.println("0");
        }
        if (str.length()>0) {
            
        
        String a[] = str.split("['!?,._@ ]+");
        int b = a.length;
        System.out.println(b);

        for (String c : a) {
            System.out.println(c);
        }
    }
        // if (str.length() > 0) {
            
        // } else {
            
        // }

        sc.close();
    }
}
