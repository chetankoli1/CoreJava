package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);  
        NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));  
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);  
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);  
        
        String us = usa.format(payment);
        String india = ind.format(payment);
        String china = ch.format(payment);
        String france = fr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
