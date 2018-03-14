package ex3.zoo.animal;

public class Reptile extends Animal {
	private static final String CATEGORY = "Reptile";

	public Reptile(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	public String getCategory() {
		return CATEGORY;
	}

}
