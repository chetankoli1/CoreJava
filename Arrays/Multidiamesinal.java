package Arrays;

public class Multidiamesinal {
    public static void main(String[] args) {
        // int[][] chetan = new int[3][3];
        // chetan[0] = new int[3];
        // chetan[1] = new int[3];
        // chetan[2] = new int[3];

        int[][] chetan = {{1,2,3},{1,2,5},{1,2,3}};

        for (int i = 0; i < chetan.length; i++) {
            for (int j = 0; j < chetan.length; j++) {
                System.out.print(chetan[i][j]*chetan[i][j]); 
            }
            System.out.println();
            
        }
    }
}
