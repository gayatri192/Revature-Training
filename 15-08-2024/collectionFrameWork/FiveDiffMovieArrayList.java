package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiveDiffMovieArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Kuch Kuch hota hai!!");
		list.add("Munjya!");
		list.add("Hary Potter");
		list.add("The Demon");
		list.add("Agnipath");
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);  
		System.out.println("After Sorting: "+list);

	}

}
