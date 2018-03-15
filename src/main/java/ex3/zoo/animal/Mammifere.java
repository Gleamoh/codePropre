package ex3.zoo.animal;

/**
 * @author Kevin M.
 *
 */
public class Mammifere extends Animal {
	
	/**
	 * CATEGORY : String nom de la catégorie
	 */
	private static final String CATEGORY = "Mammifere";

	/**
	 * @param label label
	 * @param comportement comportement
	 */
	public Mammifere(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.animal.Animal#getCategory()
	 */
	public String getCategory() {
		return CATEGORY;
	}
	
}
