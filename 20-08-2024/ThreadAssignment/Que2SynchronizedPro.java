package ThreadAssignment;


class SharedResource {
    
    public synchronized void printThreadInfo(String threadName) {
        System.out.println(threadName + " is running.");
        
       
        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " has completed.");
    }
}

class WorkerThread implements Runnable {
    private SharedResource resource;
    private String threadName;

    public WorkerThread(SharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            long startTime = System.currentTimeMillis();

           
            resource.printThreadInfo(threadName + " (Iteration " + i + ")");

            long endTime = System.currentTimeMillis(); 

            
            System.out.println(threadName + " (Iteration " + i + ") waited " + (endTime - startTime) + " ms.");
        }
    }
}

public class Que2SynchronizedPro {

	public static void main(String[] args) {
       
        SharedResource resource = new SharedResource();

       
        Thread thread1 = new Thread(new WorkerThread(resource, "Thread 1"));
        Thread thread2 = new Thread(new WorkerThread(resource, "Thread 2"));

        
        thread1.start();
        thread2.start();
    }

}
