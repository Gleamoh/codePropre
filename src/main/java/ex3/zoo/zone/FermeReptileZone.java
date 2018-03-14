package ex3.zoo.zone;

import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Reptile;

public class FermeReptileZone extends Zone {

	private static final double KILO_NOURRITURE_PAR_JOUR = 10;
	private static final String LABEL = "Ferme à Reptile";

	public FermeReptileZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Reptile) {
			animauxList.add((Reptile) animal);
			return true;
		}
		return false;
	}
}
