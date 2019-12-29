package zadatakDrugi;

public class EnterpriseClassSpaceShip extends AbsSpaceShipClass {
	
	int id = 24;
	String captain = "Yoda";
	public ISpacePropulsion ISP;
	
	public EnterpriseClassSpaceShip() {
		ISP = new IonPropulsion();
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
		return "Enterprise [id = " + id + "captain = " + captain + "," + "propulsion= " + ISP.getClass().getName() + '@' + Integer.toHexString(hashCode()) +  "]";
	}
	

}
