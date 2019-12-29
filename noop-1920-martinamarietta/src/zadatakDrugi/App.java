package zadatakDrugi;

public class App {

		public static EnterpriseClassSpaceShip ECSS;
		public static DiscoveryClassSpaceShip DCSS;
		
	public static void main(String[] args) {
			
			ECSS = new EnterpriseClassSpaceShip();
			//ArrayList<String> ECSS = new ArrayList <String>();
			
			ECSS.setAndPropulse(new IonPropulsion());
			System.out.println(ECSS.toString());
			
			DCSS = new DiscoveryClassSpaceShip();
			//ArrayList<String> ECSS = new ArrayList <String>();
			
			DCSS.setAndPropulse(new WarpPropulsion());
			System.out.println(DCSS.toString());
			DCSS.setAndPropulse(new TransWarpPropulsion());
			System.out.println(DCSS.toString());

		
		}

	}

