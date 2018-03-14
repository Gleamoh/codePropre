package ex3.zoo.animal;

public abstract class Animal implements IAnimal {

	/**
	 * label : String
	 */
	protected String name;
	protected String category;
	protected ComportementAnimal comportement; // HERBIVORE, CARNIVORE,

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

	public String getLabel() {
		return name;
	}

	public void setLabel(String label) {
		this.name = label;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ComportementAnimal getComportement() {
		return comportement;
	}

	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

}
