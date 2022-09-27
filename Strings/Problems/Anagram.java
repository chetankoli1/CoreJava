package Strings.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] one = a.toCharArray();
        char[] two = b.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);
        
        String fis = new String(one);
        String sec = new String(two);

        if (fis.equals(sec)) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
