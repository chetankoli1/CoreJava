package BitsMan;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = "";
        int num = n;
        while (num > 0) {
            int r = num  % 2;
            num = num / 2;
            b = r + b;
        }
        System.out.print("Binary is: "+b);
        sc.close();
    }
}
