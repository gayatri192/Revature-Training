package CollectionFrameworkAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Que2Iterator {

public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Object 1");
        arrayList.add("Object 2");
        arrayList.add("Object 3");

        
        System.out.println("ArrayList Elements:");
        Iterator itr = arrayList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

        
        HashSet<String> hashSet = new HashSet<>();

        
        hashSet.add("Object A");
        hashSet.add("Object B");
        hashSet.add("Object C");


        System.out.println("\nHashSet Elements:");
        Iterator itr1 = hashSet.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
        
        
    }

}
