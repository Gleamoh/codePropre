package ex3.zoo.animal;

public enum ComportementAnimal {
	
	HERBIVORE("Herbivore"), CARNIVORE("Carnivore"), OMNIVORE("Omnivore");


	private String label;

	/** Constructor
	 * @param categorie
	 */
	private ComportementAnimal(String label) {
		this.label = label;
	}
	
	/**
	 * Trouver le comportement en fonction du label (on evite de faire un switch)
	 * @param label
	 * @return
	 */
	public static ComportementAnimal findByLabel(String label) {
		
		for (ComportementAnimal c : values()) {
			if (c.label.equals(label)) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return label;
	}
}
