package ex3.zoo.animal;

/**
 * @author Kevin M.
 *
 */
public abstract class Animal implements IAnimal {

	/**
	 * label : String Nom de l'animal
	 */
	protected String name;
	/**
	 * category : String
	 */
	protected String category;
	/**
	 * comportement : ComportementAnimal Enumeration [HERBIVORE | CARNIVORE]
	 */
	protected ComportementAnimal comportement;

	public Animal(String name, String category, ComportementAnimal comportement) {
		this.name = name;
		this.category = category;
		this.comportement = comportement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal : " + name + ", catégorie: " + category + ", comportement " + comportement.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}



}
