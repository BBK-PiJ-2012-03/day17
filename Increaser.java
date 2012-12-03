public class Increaser implements Runnable {
private Counter c;

	public Increaser(Counter counter) {
		this.c = counter;
	}
	
	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
			/*
			try{
				t.join();
			} catch(InterruptedException e){} peng thing for printing them in the correct order
			i dont need this, because i dont need to see them in the correct order,
			the fact that the biggest number is 100000 is enough*/
		}
	}

	public  void run() {
		System.out.println(Thread.currentThread().getId()+" Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println(Thread.currentThread().getId()+" Stopping at " + c.getCount());
	}
}

/** to 100000 dn einai aparaithta k to teleuteo, alla einai sigoura to megalitero,
auto simvenei giati ekei pou pernei to getCount mporei na ginei interupt apo kapoio allo thread
k na mn to tiposei. Etsi o teleutaios ipologismos tha einai to 100000 alla meta apo auton
mporei na tipothoune ta upoloipa noumera pou exoun idi upologistei alla perimenoun gia to 
getCount
*/