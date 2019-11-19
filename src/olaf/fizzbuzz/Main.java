package olaf.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        var output = "";
	    for(var n = 1; n <= 100; n++) {
	        output = "";
            if (n % 3 == 0) {
                output += "Fizz";
            }
            if (n % 5 == 0) {
                output += "Buzz";
            }
            if (output.equals("")) {
                output += n;
            }
            System.out.println(output);
        }
    }
}
