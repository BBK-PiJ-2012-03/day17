public Tast implements Runnable {
	private int duration;

	public Task(int duration) {
		this.duration = duration
	}	
	
	public void run() {
		try {
			Thread.sleep(duration);
		}
		catch(InteruptedException ex) {
			//nothing to do here, apla tha telisoei pio grigora to task (ama ginei interupted)
		}
		Responsive.completedTaskNameList.add("Task of duration " + duration );
	}	
	
	//deuteros tropos
	
	public Tast implements Runnable {
	private int duration;
	private Responsive mainObj
	
	public Task(int duration, Responsive r) {
		this.duration = duration;
		this.mainObj = r;
	}	
	
	public void run() {
		try {
			Thread.sleep(duration);
		}
		catch(InteruptedException ex) {
			//nothing to do here, apla tha telisoei pio grigora to task (ama ginei interupted)
		}
		mainObj.addCompletedTask("Task of duration " + duration );
	}	
	