public class Tasks implements Runnable {
	private int time;
	private boolean taskReady = false;
	
	public static void main(String[] args {
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the duration (in ms) of task " + i);
			time = Integer.parseInt(System.console().readLine())
			
			try {
				Thread.sleep(1000); // sleep 1 second
			} catch (InterruptedException ex) {
			// Nothing to do in this case, just sleep less...
			  }
		}	
	}
}	
	