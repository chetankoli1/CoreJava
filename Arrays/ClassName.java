package Arrays;

import java.util.Scanner;

public class ClassName{
    public static int sqrt(int i){
        return i * i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrt(9));
       System.out.println("Enter table");
       for (int i = 1; i <= 10; i++) {
        System.out.println(sqrt(i*n));
        sc.close();
       }
    }
}