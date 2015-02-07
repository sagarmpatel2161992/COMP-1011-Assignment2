package superHero;

/**
 * @author SAGAR
 * Program Description: SuperHero Class for generating powers and showing Powers.
 * Version: 1.0 4th February 2015
 *
 */

public class SuperHero extends Hero {

	private String[] superPowers = new String[3];
	private String[] powers = { "Super Speed", "Super Strength", "Body Armour",
			"Flight", "Fire Generation", "Weather Control" };

	// SuperHero Constructor with name as argument
	public SuperHero(String name) {
		
		// superclass constructor call
		super(name);
		
		// generateRandomPowers method call 
		generateRandomPowers();
		// TODO Auto-generated constructor stub
	}

	// generateRandomPower method
	private void generateRandomPowers() {
		// array for 3 random number
		int random[] = new int[3];
		
		// loop for getting 3 non-repitive random number between 1 to 6
		for (int x = 0; x <= 2; x++) {
			random[x] = (int) (Math.random() * 10000 + 1) % 6;
			if (x > 0) {
				for (int c = 0; c <= x - 1; c++) {
					if (random[c] == random[x])
						x--;
				}
			}
		}
		// assigning three random power to superPower array
		for (int i = 0; i < 3; i++)
			superPowers[i] = powers[random[i]];
	}

	
	// showPowers method
	public void showPowers() {
		for (int i = 0; i < 3; i++)
			System.out.println("Power " + (i + 1) + ": " + superPowers[i]);
	}

}
