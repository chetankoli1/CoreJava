package Recursion;

public class FibbonachiUsingRecursion {
    public static int getFibbonchi(int n) {
        
        return n;
    }
    public static void main(String[] args) {
        int a = 0,b = 1;
        int sum = 0;
        int i = 0;
        int n = 7;

        while (i < n) {
            sum = a + b;
            sum = a;
            a = b;
            i++;
        }
    }
}
