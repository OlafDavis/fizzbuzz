package olaf.fizzbuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringList output;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter highest number:");
        int maxN = scanner.nextInt();
        for(var n = 1; n <= maxN; n++) {
            StringBuilder emptyBuilder = new StringBuilder();
	        output = new StringList(emptyBuilder, (n % 17 == 0));
            if (n % 11 == 0) {
                if (n % 13 == 0) output.add("Fezz");
                output.add("Bong");
            } else {
                if (n % 3 == 0) output.add("Fizz");
                if (n % 13 == 0) output.add("Fezz");
                if (n % 5 == 0) output.add("Buzz");
                if (n % 7 == 0) output.add("Bang");
            };
            if (output.length() == 0) output.add(Integer.toString(n));
            System.out.println(n + ": " + output.output());
        }
    }

}

class StringList {
    StringBuilder sb;
    Boolean isReverse;
    public StringList(StringBuilder startBuilder, Boolean startIsReverse) {
        sb = startBuilder;
        isReverse = startIsReverse;
    }
    public void add(String str) {
        if (isReverse) {
            sb.insert(0, str);
        } else {
            sb.append(str);
        }
    }
    public StringBuilder output() {
        return sb;
    }
    public Integer length() {
        return sb.length();
    }
}