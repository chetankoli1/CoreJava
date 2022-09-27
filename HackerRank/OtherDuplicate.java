package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class OtherDuplicate {
    public static void OtherThanDuplicate(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list.remove(arr[i]);
                    //list.remove(arr[j]);
                    // arr[i] = arrr[i];
                     //arr[j] = arrr[i];                     
                    continue;
                    //arr[i] = arr[j];
                    
                }
                
            }
            for (int j = 0; j <= list.size(); j++) {
                System.out.print(list);
            }
           
        }
        
    }

    public static void main(String[] args) {
        int a[] = {1,2,2,4,5,6,3,5,3};
        OtherThanDuplicate(a);
        // int n = a.length;
        // n = OtherThanDuplicate(a);
        // Arrays.sort(a);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i]);
        // }
    }
}