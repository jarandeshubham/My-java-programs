package practice;

	import java.util.*;
	import java.io.*;

	class Function 
	{ 
	  String ArithGeo(int[] arr) {
	    boolean arith = true;
	    boolean geo = true;
	   
	    int numberArith = arr[1]-arr[0];
	    int numberGeo = arr[1]/arr[0];
	    for (int i = 2; i < arr.length; i++) {
	      if (!(arr[i] == arr[i-1] + numberArith)) {
	          arith = false;
	      }
	      if (!(arr[i] == arr[i-1] * numberGeo)) {
	          geo = false;
	      }  
	    }
	   
	    if (arith) {
	        return "Arithmetic";
	    }
	    else if (geo) {
	        return "Geometric";
	    }
	   
	    return "-1";
	  }
	 
	  public static void main (String[] args) { 
	    // keep this function call here    
	    Scanner  s = new Scanner(System.in);
	    Function c = new Function();
	    System.out.print(0.1);
	  
	
	}
	
}
