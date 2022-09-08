package Strings;

public class FirstElement {
    public String addStr(String s,char a){
        String add = String.valueOf(a) + s;
        return add;
    }
    public static void main(String[] args) {
        int num=10; // int number


        while (num > 0) {
        
            System.out.println( num % 10);
        
            num = num / 10;
        
        }
    
    }
}
