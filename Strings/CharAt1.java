package Strings;

import java.util.ArrayList;

public class CharAt1 {

    public static void main(String[] args) {
        String str = "chetan";
        ArrayList<Object> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
             arr.add(str.charAt(i));
        }
        System.out.println(arr);
    }
}
