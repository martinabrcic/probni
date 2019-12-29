package zadatakDrugi;

public class IonPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("This propulsion is -> " + getClass().getSimpleName());
	}


}
