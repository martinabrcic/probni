package zadatakDrugi;

public class DiscoveryClassSpaceShip extends AbsSpaceShipClass {
	
	
	int id = 543;
	String captain = "Master";
	public ISpacePropulsion ISP;
	
	public DiscoveryClassSpaceShip() {
		ISP = new WarpPropulsion();
	}
	
	public void setAndPropulse(ISpacePropulsion ISP) {
		this.ISP = ISP;
		ISP.engagePropulsion();
	}
	
	@Override
	protected void performFlyingWithPropulsion() {
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "DiscoveryClassSpaceShip [id = " + id + "captain = " + captain + "," + "propulsion= " + ISP.getClass().getName() + '@' + Integer.toHexString(hashCode()) +  "]";
	} 

}
