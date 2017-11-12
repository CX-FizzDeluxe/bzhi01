package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5")))  {
        	return "fizz buzz";
        }
        else if (number % 3 == 0 || String.valueOf(number).contains("3"))  {
        	return "fizz";
        }
        else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
        	return "buzz";
        }
        else {
        	return "" + number;
        }
    }

}
