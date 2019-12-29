package zadatakDrugi;

public class WarpPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("This propulsion is -> " + getClass().getSimpleName());
		
	}

}
