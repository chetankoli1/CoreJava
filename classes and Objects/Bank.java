import java.util.Scanner;

//cretated multiple backing opration with help of java

class Admin{
    void registerUser(String name,int age){
        
    }
    
}
public class Bank {
    void checkUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username: ");
        String username = sc.next();

        System.out.println("Enter Your Password: ");
        String password = sc.next();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("User are admin");
        } else {
            System.out.println("User are Custormer");
        }
        sc.close();
    }

    void forAdmin(){
        
    }

    void forCustomer(){

    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.checkUser();

    }
}
