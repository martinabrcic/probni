package zadatakDrugi;

public class TransWarpPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("This propulsion is -> " + getClass().getSimpleName());
		
	}

}
