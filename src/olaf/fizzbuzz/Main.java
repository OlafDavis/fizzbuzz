package olaf.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        var output = "";
	    for(var n = 1; n <= 100; n++) {
	        output = "";
            if (n % 3 == 0) output += "Fizz";
            if (n % 5 == 0) output += "Buzz";
            if (n % 7 == 0) output += "Bang";
            if (output.equals("")) output = Integer.toString(n);
            if (n % 11 == 0) output = "Bong";
            System.out.println(output);
        }
    }
}
