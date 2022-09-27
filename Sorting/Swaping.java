package Sorting;

public class Swaping {
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,1};
        for (int i = 0; i < arr.length-1; i++) {
            //moving the first element to last element
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
