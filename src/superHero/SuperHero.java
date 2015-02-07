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
			int random[] = new int[3];
			for(int x=0;x<=2;x++)
		      {
		          random[x]=(int)(Math.random() * 10000 +1 ) % 6;
		          if(x>0)
		          {
		              for(int c=0;c<=x-1;c++)
		              {
		                  if(random[c]==random[x])
		                      x--;
		              }
		          }
		      }
			for(int i=0; i<3;i++)
				superPowers[i] = powers[random[i]];
			
		}
		
		public void showPowers()
		{
		
		}
}
