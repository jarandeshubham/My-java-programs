import java.util.*;
import java.io.*;
import java.lang.Object;
 import java.util.Arrays;

class function { 
	 String ArithGeo(int[] arr) {
	        if (isArithmetic(arr)) {
	            return "Arithmetic";
	        } else if (isGeometric(arr)) {
	            return "Geometric";
	        }

	        return "-1";
	    }

	    boolean isArithmetic(int[] arr) {
	        int diff = arr[1] - arr[0];
	        int previousDiff = diff;
	        for (int i = 2; i < arr.length; i++) {
	            diff = arr[i] - arr[i - 1];
	            if (diff != previousDiff) {
	                return false;
	            }
	            previousDiff = diff;
	        }
	        return true;
	    }

	    boolean isGeometric(int[] arr) {
	        int diff = arr[1] / arr[0];
	        int previousDiff = diff;
	        for (int i = 2; i < arr.length; i++) {
	            diff = arr[i] / arr[i - 1];
	            if (diff != previousDiff) {
	                return false;
	            }
	            previousDiff = diff;
	        }
	        return true;
	    }

	    public static void main (String[] args) {
	        // keep this function call here
	        Scanner s = new Scanner(System.in);
	        ArithGeo c = new ArithGeo();
	        System.out.print(c.ArithGeo(new int[] {2, 6, 18, 54}));
	    } 
}
