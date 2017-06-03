package main.java.com.gemini.training;

import java.util.*;
import java.util.stream.*;

public class FindDuplicates_Set {
    public static void main(String[] args) {
      //  Set<String> distinctWords = (Set<String>) Arrays.asList(args);
        System.out.println("Input:"+Arrays.asList(args));
//        System.out.println(distinctWords.size()+ 
//                           " distinct words: " + 
//                           distinctWords);
//        
        useForEach(args);
    }

	private static void useForEach(String []arr) {
		  Set<String> s = new HashSet<String>();
		  Set<String> t = new HashSet<String>();
		  for (String a : arr)
	               if(!s.add(a)){
	            	 t.add(a);  
	               };
	               
	               System.out.println(s.size() + " distinct words: " + s);
	               System.out.println(s.size() + " repeated words: " + t);
		
	}
}