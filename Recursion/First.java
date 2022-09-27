package Recursion;

public class First {
    public static void main(String[] args) {
        getRever(5);
    }

    static void getRever(int n){
       if (n == 0) {
        return;
       }
       System.out.println(n);
       getRever(n-1);
    }
}
