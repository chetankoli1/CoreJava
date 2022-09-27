package Swaping;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Simple {
    public static void main(String[] args) {
        int[] arr = {8,5,2,1,4,7,9,6,3};
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }

        int n = arr.length;

        for (int i = 3; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
            System.out.print(arr[i]);
        }

    }
}
