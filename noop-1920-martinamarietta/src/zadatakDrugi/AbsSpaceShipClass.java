package zadatakDrugi;

public abstract class AbsSpaceShipClass {
	protected int id;
	protected ISpacePropulsion ISP;
	protected String captain;
	
	protected void setPropulsion(ISpacePropulsion ISP) {
		
		this.ISP = ISP;
		
	}
	
	protected abstract void  performFlyingWithPropulsion();

	
}
