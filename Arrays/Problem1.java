package Arrays;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Nuber To Search: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Available at index: "+i);
                break;         
            } 
            System.out.println("Item Not Found In list"); 
         }
         
    }

}
