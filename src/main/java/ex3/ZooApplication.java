package ex3;

import ex3.zoo.Zoo;
import ex3.zoo.animal.ComportementAnimal;
import ex3.zoo.animal.Mammifere;
import ex3.zoo.animal.Poisson;
import ex3.zoo.animal.Reptile;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Mammifere("Gazelle", ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Mammifere("Zèbre", ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Mammifere("Zèbre", ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Mammifere("Panthère", ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin blanc", ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Poisson("Truite dorée", ComportementAnimal.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor", ComportementAnimal.CARNIVORE));
		zoo.addAnimal(new Reptile("Python", ComportementAnimal.CARNIVORE));	
		
		
		zoo.afficherListeAnimaux();
	}

}
