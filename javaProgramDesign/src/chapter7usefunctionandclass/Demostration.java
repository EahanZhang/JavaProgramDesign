package chapter7usefunctionandclass;

public class Demostration {
	private static int counter = 0;
	public Demostration() {
		// TODO Auto-generated constructor stub
		++counter;
	}
	
	public static void main(String[] args) {
		Demostration demostration1 = new Demostration();
		Demostration demostration2 = new Demostration();
		Demostration demostration3 = new Demostration();
		
		System.out.println(demostration1.toString());
		
	}
}
