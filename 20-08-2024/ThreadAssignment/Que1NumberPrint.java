package ThreadAssignment;

public class Que1NumberPrint implements Runnable {
	
	public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {
    	printNumbers();
    }

	public static void main(String[] args) {
		
		Que1NumberPrint number = new Que1NumberPrint();

        Thread thread = new Thread(number);
        thread.start();
		

	}

}
