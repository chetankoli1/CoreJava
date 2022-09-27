package Strings;

public class StringBuilder1 {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("chetan");
        System.out.println(sb);
        sb.setCharAt(0, 's');
        System.out.println(sb);
        sb.insert(2, "sagar");
        System.out.println(sb);
        sb.delete(2, 7);
        System.out.println(sb);
        sb.append(" ");
        sb.append("k");
        sb.append("o");
        sb.append("l");
        sb.append("i");
        System.out.println(sb);

    }
}
