package ex3.zoo.animal;

/**
 * @author Kevin M.
 *
 */
public class Poisson extends Animal {

	/**
	 * CATEGORY : String nom de la catégorie
	 */
	private static final String CATEGORY = "Poisson";
	
	/**
	 * @param name name
	 * @param comportement comportement
	 */
	public Poisson(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	/* (non-Javadoc)
	 * @see ex3.zoo.animal.Animal#getCategory()
	 */
	@Override
	public String getCategory() {
		return super.getCategory();
	}
	
	
}
