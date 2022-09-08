package Arrays;

public class Simple {
    public static void main(String[] args) {
        int[] chetan = {6,2,3,1,5,4};

        int sum = 0;

        for (int i = 0; i < chetan.length; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
