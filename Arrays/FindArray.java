package Arrays;

import java.util.Scanner;

public class FindArray {
    static int[] findIndex(int a[], int n, int key)
    {
        int start = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                start = i;
                break;
            }
        }
 
        // if (start == -1) {
        //     System.out.println("Key not present in array");
        // }
 
        int end = start;
        for (int i = n - 1; i >= start; i--) {
            if (a[i] == key) {
                break;
            }
        }
        int arr[] = {start,end};
        System.out.print(arr[0]+" "+arr[1]);
        // if (start == end)
        //     System.out.println("Only one key is present at index : " + start);
        // else {
        //     System.out.println("Start index: " + start);
        //     System.out.println("Last index: " + end);
        // }
        return arr;
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();
    

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
