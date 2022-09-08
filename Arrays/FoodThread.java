package Arrays;

public class FoodThread extends Thread{
    public static void main(String[] args) {
        FoodThread t = new FoodThread();
        t.start();
        System.out.println("one");
        t.start();
        System.out.println("two");
    }
}
