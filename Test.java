import Strings.SubString;

public class Test {
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
 
    public static void main(String[] args) {
      String a = "chetan koli";
      String[] s = a.split(" ");2
      for (int i = 0; i < s.length; i++) {
        System.out.print(s[i]);
      }
    
    }
}
