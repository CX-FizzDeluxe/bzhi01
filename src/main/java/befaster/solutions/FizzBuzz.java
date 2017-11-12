package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	
    	if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5")) && (number > 10 && checkForIdentical(number)))  {
        	return "fizz buzz";
        }
    	else if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5")))  {
        	return "fizz buzz";
        }
        else if (number % 3 == 0 || String.valueOf(number).contains("3"))  {
        	return "fizz";
        }
        else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
        	return "buzz";
        }
        else if (number > 10 && checkForIdentical(number)) {
        	return "deluxe";
        }
        else {
        	return "" + number;
        }
    }
    
    private static boolean checkForIdentical(Integer number) {
    	String numberInString = String.valueOf(number);
    	char[] numberArray = numberInString.toCharArray();
    	boolean isIdentical = false;
    	for(int i=0; i < numberArray.length; i++) {
    		if (i + 1 < numberArray.length ) {
    			if (numberArray[i] == numberArray[i+1]) {
    				isIdentical = true;
    			}
    			else {
    				return false;
    			}
    		}
    	}
    	return isIdentical;
    }

}
