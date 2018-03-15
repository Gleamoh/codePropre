package ex3.zoo.zone;

import ex3.zoo.animal.ComportementAnimal;
import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Mammifere;

public class SavaneAfricaineZone extends Zone {

	/**
	 * KILO_NOURRITURE_PAR_JOUR : double
	 */
	private static final double KILO_NOURRITURE_PAR_JOUR = 10;
	/**
	 * LABEL : String
	 */
	private static final String LABEL = "Savane Africaine";

	/** Constructor
	 * 
	 */
	public SavaneAfricaineZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.zone.Zone#addAnimal(ex3.zoo.animal.IAnimal)
	 */
	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Mammifere) {
			if (((Mammifere) animal).getComportement().equals(ComportementAnimal.HERBIVORE)) {
				animauxList.add((Mammifere) animal);
				return true;
			}
		}
		return false;
	}
}
