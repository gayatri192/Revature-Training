package com.datastructure.queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MedianEleOfQueue {

	public static void main(String[] args) {
		
		Queue<Integer> obj = new LinkedList<Integer>();
        obj.add(123);
        obj.add(120);
        obj.add(220);
        obj.add(403);
        obj.add(350);
        obj.add(250);
        obj.add(150);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.addAll(obj);

         
        int size = priorityQueue.size();
        int mid = size / 2;
        float median;
        if (size % 2 == 0) {
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            median = (float)(first + second) / 2;
        } else {
            for (int i = 0; i < mid; i++) {
                priorityQueue.poll();
            }
            median = priorityQueue.poll();
        }

        System.out.println("Median: " + median);

	}

}
