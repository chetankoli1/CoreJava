package Patterns;
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 5-4) {
                System.out.print("  ");
            } else {
                System.out.print("* ");   
            }
        }
        System.out.println();
    }
}
