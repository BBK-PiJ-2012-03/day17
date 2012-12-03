public class Counter {
private int n = 0;

	public synchronized void increase() {
		n++;
	}
	public int getCount() {
		return n;   // auth i methodos dn xreiazete na ginei synchronized gt dn me noiazei
					// me afora mono to getCount sto telos na einai to swsto
					// kata ti diarkei mporie na mn einai swsto alla sto tleos tha einai
					// auto DEN simvenei sto BankAccount
	}
}