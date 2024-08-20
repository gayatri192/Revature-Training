package com.collectionFrameWork;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Double> bal = new HashMap<String, Double>();
		
		bal.put("harshu", 2000.0);
		bal.put("Yash", 1000.0);
		bal.put("Nilesh", 1789.0);
		bal.put("Manish", 1000.0);
		bal.put("Sujal", 1900.0);
		
		System.out.println(bal.get("Yash"));
		
		Set<String> keys = bal.keySet();
		for(String key : keys){
			System.out.println(key + " : "+bal.get(key));
		}

	}

}
