package CollectionFrameworkAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Que1ArrayHash {

	public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Object 1");
        arrayList.add("Object 2");
        arrayList.add("Object 3");

        
        System.out.println("ArrayList Elements:");
        for (String obj : arrayList) {
            System.out.println(obj);
        }

        
        HashSet<String> hashSet = new HashSet<>();

        
        hashSet.add("Object A");
        hashSet.add("Object B");
        hashSet.add("Object C");


        System.out.println("\nHashSet Elements:");
        for (String obj : hashSet) {
            System.out.println(obj);
        }
    }

}
