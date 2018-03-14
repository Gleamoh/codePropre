package ex3.zoo.zone;

import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Poisson;

public class AquariumZone extends Zone {

	private static final double KILO_NOURRITURE_PAR_JOUR = 0.2;
	private static final String LABEL = "Aquarium";

	public AquariumZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Poisson) {
			animauxList.add((Poisson) animal);
			return true;
		}
		return false;
	}

}
