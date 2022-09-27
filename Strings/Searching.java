package Strings;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        String[] strs = new String[len];

        for (int i = 0; i < len; i++) {
            strs[i] = sc.next();
        }
        System.out.println("Enter Your Search: ");
        String sr = sc.next();
        boolean found = false;
        for (int i = 0; i < len; i++) {
            if (sr.equalsIgnoreCase(strs[i])) {
                System.out.println("Search Found at index: "+i);
                found = true;
            }
        }
        if(!found) System.out.println("Search Not Found in List");

        sc.close();
    }
}
