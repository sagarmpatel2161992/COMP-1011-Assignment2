package superHero;

public class SuperHero extends Hero {
	
	private String[] superPowers = new String[3];
	 private String[] powers ={"Super Speed","Super Strength", "Body Armour","Flight","Fire Generation","Weather Control"};

	 public SuperHero(String name) {
			super(name);
			generateRandomPowers();
			// TODO Auto-generated constructor stub
		}
		private void generateRandomPowers()
		{	
			
		}
		
		public void showPowers()
		{
		
		}
}
