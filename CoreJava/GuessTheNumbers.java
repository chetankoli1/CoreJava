package CoreJava;
import java.util.Scanner;

public class GuessTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("add your gessed number in 100");
        int n = sc.nextInt();

        int ans = n - 100;
        System.out.println(ans);
        sc.close();
    }
}
