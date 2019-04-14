package application.dice;

import java.util.Random;

public abstract class Dice {
	int size;
	
	public int roll() {
		Random r = new Random();
		return r.nextInt(size + 1);
	}

}
