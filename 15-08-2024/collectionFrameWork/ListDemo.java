package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.add("Gayatree");
		list.add("Nandini");
		list.add("Riya");
		list.add("Aashlesh");
		list.add("Anshika");
		/*
		for(String name:list){
			System.out.println(name);
			list.remove("Riya");
			//list.remove(1);
		}
		*/
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
