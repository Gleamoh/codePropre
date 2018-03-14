package ex3.zoo.animal;

public class Poisson extends Animal {

	private static final String CATEGORY = "Poisson";
	
	public Poisson(String name, ComportementAnimal comportement) {
		super(name, CATEGORY, comportement);
	}

	@Override
	public String getCategory() {
		return super.getCategory();
	}
	
	
}
