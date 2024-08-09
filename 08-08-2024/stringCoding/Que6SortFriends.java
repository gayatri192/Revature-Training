package com.stringCoding;

public class Que6SortFriends {

	public static void main(String[] args) {
        
        String[] friends = {
            "Rutu", "Mohini", "Priya", "Anshika", "Nandini", 
            "Harshu", "Nilesh", "Yash", "Riddhi", "Trupti"
        };

       
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                  
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }

      
        System.out.println("Friends sorted in alphabetical order:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }

}
