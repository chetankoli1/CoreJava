package Patterns;
public class DirectNamePattern {
    public static void main(String[] args) {
        int col = 35;
        int row = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == 5) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
