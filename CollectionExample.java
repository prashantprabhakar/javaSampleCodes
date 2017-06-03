package main.java.com.gemini.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String a[]){
		operateJDK8();
	}
	
	public static void operateJDK8(){
		Collection<String> c = new ArrayList<String>();
		c.add("Ritika");
		c.add("ABC");
		c.add("XYZ");
		c.add("123");
		c.add("Ring");
		
		
		///jdk8
		
		c.parallelStream()
		.filter(e -> e.contains("Ri"))
		.forEach(e -> System.out.println(e));
		
		System.out.println("Using For");
		for(String s: c){
			System.out.println(s);
		}
		
		System.out.println("Using Itr");
		Iterator<String> itr = c.iterator();
		while(itr.hasNext()){
			System.out.println("Iteration:::   "+itr.next());
		}
		
	}
}
