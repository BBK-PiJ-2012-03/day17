public class Responsive {
	public static List<String> completedTaskNameList = .... ;
		
	public static void main(String[] args {
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the duration (in ms) of task " + i);
			int time = Integer.parseInt(System.console().readLine()) //edw kanonika prepei na kanw catch to exeption numberformat
			Task task = new Task(time)
			Thread t = new Thread(task);
			t.start();
			printReport();
		}
	}
}	
	private void printReport() {
		if(completedTaskNameList != null && !completedTaskNameList.isEmpty()) {
			print(completedTaskNameList); //auth ti methodo prepei na ti ftiaksw kiolas
		}
		completedTaskNameList = new ArrayList();
	}

//autos itan o prwtos tropos me PUBLIC list pou einai kakos 2os tropos apo katw
	
	
	public class Responsive {
	private List<String> completedTaskNameList = .... ;
		
	public static void main(String[] args {
		Responsive r = new Responsive()
		r.launch();
	}

	private void launch() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the duration (in ms) of task " + i);
			int time = Integer.parseInt(System.console().readLine()) //edw kanonika prepei na kanw catch to exeption numberformat
			Task task = new Task(time, this)
			Thread t = new Thread(task);
			t.start();
			printReport();
		}
	}
}	
	public synchronized void addCompleteTast(String name) {
		completedTaskNameList.add(name);
	}	
	
	private synchronized void printReport() {
		if(completedTaskNameList != null && !completedTaskNameList.isEmpty()) {
			print(completedTaskNameList); //auth ti methodo prepei na ti ftiaksw kiolas
		}
		completedTaskNameList = new ArrayList();
	}
