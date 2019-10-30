import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a face card: (J, Q, K or A)");
        String userInput = sc.next().toUpperCase();
        System.out.println(conversion(userInput));
    }

    public static int conversion (String x) {
        if (x.equals("J") || x.equals("Q") || x.equals("K")) {
            return 10;
        } else if (x.equals("A")) {
            return 11;
        }else{
            return 0;
        }
    }
}


