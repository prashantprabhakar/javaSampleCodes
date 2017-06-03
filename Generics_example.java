package main.java.com.gemini.training;

import java.util.ArrayList;
import java.util.List;

public class Generics_example {
	public static void main(String args[]){
		runtimeerror();
		safecode();
	}

	private static void runtimeerror() {
		List l = new ArrayList();
		l.add("Ritika");
		l.add(2);
		String s = (String) l.get(1);
		
	}

	private static void safecode() {
		List<String> l = new ArrayList<String>();
		l.add("Ritika");
		l.add("2");
		for(int i = 0; i < l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
