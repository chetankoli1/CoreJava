package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int end = sc.nextInt();
            ArrayList<Integer> arrs = new ArrayList<>();
            ArrayList<Integer> second = new ArrayList<>();

            for (int i = 1; i <= end; i++) {
               arrs.add(i);
            }
            Integer[] t1 = arrs.toArray(new Integer[0]);
            for(Integer n : t1){
                System.out.print(n);
            }
            System.out.println();

            for (int i = arrs.size(); i > 0; --i) {
                second.add(i);
            }

            Integer[] t2 = second.toArray(new Integer[0]);
            for(Integer n : t2){
                System.out.print(n+" ");
            }
            sc.close();


        }
}
