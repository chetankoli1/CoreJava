package Arrays;

public class Fibonacci {
    static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);
    }

    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) ||
                isPerfectSquare(5 * n * n - 4);
    }

    public static int fibonacci_numbers(int n)
    {
      if(n == 0){
        return 0;
      }
      else if(n == 1){
        return 1;
      }
      else{
        return fibonacci_numbers(n-2) + fibonacci_numbers(n-1);
      }
    }


    static int getFibInput(int n) {
        if (isFibonacci(n)) {
            return n;
        } else {
            int sum = 0;
            for(int i = 1; i < n; i++){
                if (fibonacci_numbers(i)<= n) {
                      sum = fibonacci_numbers(i) + fibonacci_numbers(i+1);
                }
                
            }
            return sum-1;
            
        }
    }

    public static void main(String[] args) {
        System.out.println(getFibInput(13));
    }
}
