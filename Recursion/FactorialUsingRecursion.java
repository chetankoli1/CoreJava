package Recursion;

public class FactorialUsingRecursion {
    public static int findFactorialOfn(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return findFactorialOfn(n-1) * n;
    }
    public static void main(String[] args) {
        System.out.println(findFactorialOfn(5));
    }
}
