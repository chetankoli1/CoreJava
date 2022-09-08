package Arrays;

public class SortingArray {

    int sum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);

        return n;
        // code here
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1};
        new SortingArray().sum(arr, 2);
    }
}
