package Arrays;


public class CheckMissingNumber {

    void my_method(){
        int num = 23+1;
        
        class Methodinner_Demo{
            int num1 = num;
            public void print(){
                System.out.println("value"+num1);
            }
        }
        Methodinner_Demo in = new Methodinner_Demo();
        in.print();

    }
    public static void main(String[] args) {
        
    }
}
