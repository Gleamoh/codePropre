package ex3.zoo.animal;

/**
 * @author Kevin M.
 *
 */
public class Reptile extends Animal {
	/**
	 * CATEGORY : String nom de la catégorie
	 */
	private static final String CATEGORY = "Reptile";

	/**
	 * @param name name
	 * @param comportement comportement
	 */
	public Reptile(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.animal.Animal#getCategory()
	 */
	public String getCategory() {
		return CATEGORY;
	}

}
