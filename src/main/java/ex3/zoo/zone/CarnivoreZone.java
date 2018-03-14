package ex3.zoo.zone;

import ex3.zoo.animal.ComportementAnimal;
import ex3.zoo.animal.IAnimal;
import ex3.zoo.animal.Mammifere;

public class CarnivoreZone extends Zone {

	private static final double KILO_NOURRITURE_PAR_JOUR = 10;
	private static final String LABEL = "Carnivore";

	public CarnivoreZone() {
		super(LABEL, KILO_NOURRITURE_PAR_JOUR);
	}

	@Override
	public boolean addAnimal(IAnimal animal) {
		if (animal instanceof Mammifere) {
			if (((Mammifere) animal).getComportement().equals(ComportementAnimal.CARNIVORE)) {
				animauxList.add((Mammifere) animal);
				return true;
			}
		}
		return false;
	}
}
