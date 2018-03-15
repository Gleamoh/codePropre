package ex3.zoo.zone;

import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Poisson;

/**
 * @author Kevin M.
 *
 */
public class AquariumZone extends Zone {

	/**
	 * KILO_NOURRITURE_PAR_JOUR : double
	 */
	private static final double KILO_NOURRITURE_PAR_JOUR = 0.2;
	/**
	 * LABEL : String
	 */
	private static final String LABEL = "Aquarium";

	/** Constructor
	 * 
	 */
	public AquariumZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.zone.Zone#addAnimal(ex3.zoo.animal.IAnimal)
	 */
	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Poisson) {
			animauxList.add((Poisson) animal);
			return true;
		}
		return false;
	}

}
