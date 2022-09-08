package Arrays;
import java.util.Scanner;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Solution s = new Solution();
            s.seriesSum(n);
        }
       
        sc.close();
    }
}

class Solution {
    long seriesSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
        return n;
            
    }
}