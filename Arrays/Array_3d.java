package Arrays;
public class Array_3d{
    public static void main(String[] args) {
        int i=1;
        a : while (i<=3) {
            System.out.print(i);
            for (int j2 = 1; j2 <= 5; j2++) {
               
                System.out.println("\t"+j2);
                if(j2 == 3) {
                    i++;
                    continue a;
                }      
            }
            i++;
            System.out.println("------------");
        }
        
    
    }
    
}