package chapter6circulation;

public class FourHobo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_TIME = 14;
		int timeHoboA = 0;
		int timeHoboB = 0;
		int timeHoboC = 0;
		int timeHoboD = 0;
		
		for (timeHoboA = 1; timeHoboA <= MAX_TIME; timeHoboA++) {
			for (timeHoboB = timeHoboA; timeHoboB <= MAX_TIME; timeHoboB++) {
				for (timeHoboC = timeHoboB; timeHoboC <= MAX_TIME; timeHoboC++) {
					for (timeHoboD = timeHoboC; timeHoboD <= MAX_TIME; timeHoboD++) {
						if (timeHoboA * timeHoboA + timeHoboB * timeHoboB
								+ timeHoboC * timeHoboC + timeHoboD * timeHoboD == 200) {
							System.out.println("[" 
								+ timeHoboA + ", " 
								+ timeHoboB + ", " 
								+ timeHoboC + ", "
								+ timeHoboD + "]");
						}
					}
				}
			}
		}
		
	}

}
