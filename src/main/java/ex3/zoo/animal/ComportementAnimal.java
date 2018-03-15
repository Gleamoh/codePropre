package ex3.zoo.animal;

/**
 * @author Kevin M.
 *
 */
public enum ComportementAnimal {
	
	HERBIVORE("Herbivore"), CARNIVORE("Carnivore"), OMNIVORE("Omnivore");


	/**
	 * label : String
	 */
	private String label;

	/** Constructor
	 * @param categorie - categorie
	 */
	private ComportementAnimal(String label) {
		this.label = label;
	}
	
	/**
	 * Trouver le comportement en fonction du label (on evite de faire un switch)
	 * @param label label
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
