package Arrays;

import java.util.Scanner;

public class ArrayMukul {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        n = n + i;
        if (n <= 10) {
            System.out.println(n);
        }else{
            
        }
    }
    sc.close();
    }
}
