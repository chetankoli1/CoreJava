package CoreJava;

public class Blocks {
    public static void main(String[] args) {
        int x = 3;
        {
            System.out.println("one");
            {
                System.out.println("two");
                 {
                    System.out.println("three");
                }
                for (int i = 0; i < x; i++) {
                    if (x == 2) {
                        break;
                    }
                }
                
            }

           
        }
        
        
    }
}
