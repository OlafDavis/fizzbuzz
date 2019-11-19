package olaf.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String output;
        Boolean isReverse;                                                                                                  // indicates reversed order, if n is mult of 17
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter highest number:");
        int maxN = scanner.nextInt();
        for(var n = 1; n <= maxN; n++) {
            isReverse = (n % 17 == 0);
	        output = "";
            if (n % 11 == 0) {
                if (n % 13 == 0) output = addString(output, "Fezz", isReverse);
                output = addString(output, "Bong", isReverse);
            } else {
                if (n % 3 == 0) output = addString(output, "Fizz", isReverse);
                if (n % 13 == 0) output = addString(output, "Fezz", isReverse);
                if (n % 5 == 0) output = addString(output, "Buzz", isReverse);
                if (n % 7 == 0) output = addString(output, "Bang", isReverse);
                if (output.equals("")) output = Integer.toString(n);
            };
            System.out.println(n + ": " + output);
        }
    }

    static String addString(String oldString, String stringToAdd, Boolean reverseOrder) {
        if (reverseOrder) {                                                                                             // reverseOrder means add new string to left instead of right
            return stringToAdd + oldString;
        } else {
            return oldString + stringToAdd;
        }
    }

}
