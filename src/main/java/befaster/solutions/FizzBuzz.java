package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
    	
    	if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5")) && ((number % 3 == 0 && String.valueOf(number).contains("3")) || (number % 5 == 0 && String.valueOf(number).contains("5"))))  {
        	if (number % 2 == 0) {
        		return "fizz buzz deluxe";
        	}
        	else {
        		return "fizz buzz fake deluxe";
        	}
        }
    	else if ((number % 3 == 0 || String.valueOf(number).contains("3")) && (number % 5 == 0 || String.valueOf(number).contains("5")))  {
        	return "fizz buzz";
        }

        else if ((number % 3 == 0 && String.valueOf(number).contains("3"))) {
        	if (number % 2 == 0) {
        		return "fizz deluxe";
        	}
        	else {
        		return "fizz fake deluxe";
        	}
        }
        else if ((number % 5 == 0 && String.valueOf(number).contains("5"))){
        	if (number % 2 == 0) {
        		return "buzz deluxe";
        	}
        	else {
        		return "buzz fake deluxe";
        	}
        }
        else if (number % 3 == 0 || String.valueOf(number).contains("3"))  {
        	return "fizz";
        }
        else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
        	return "buzz";
        }
        else if (number > 10 && checkForIdentical(number)) {
        	if (number % 2 == 0) {
        		return "deluxe";
        	}
        	else {
        		return "fake deluxe";
        	}
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
