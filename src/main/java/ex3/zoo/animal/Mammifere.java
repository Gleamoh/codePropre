package ex3.zoo.animal;

public class Mammifere extends Animal {
	
	private static final String CATEGORY = "Mammifere";

	public Mammifere(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	public String getCategory() {
		return CATEGORY;
	}
	
}
