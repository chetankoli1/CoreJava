package Strings.Problems;

public class CheckBinary {
    boolean isCheck(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {
                return false;
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new CheckBinary().isCheck("11e32323"));
    }
}
