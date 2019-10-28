import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.math.*;
import java.util.regex.*;
import java.util.Locale;

public class CurrencyFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indian= new Locale("en","IN");
        Locale chinese= new Locale("zh","CH");
        Locale french= new Locale("fr","FR");
        

        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india= NumberFormat.getCurrencyInstance(indian); 
        NumberFormat china= NumberFormat.getCurrencyInstance(chinese);
        NumberFormat france= NumberFormat.getCurrencyInstance(french);
      
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}


