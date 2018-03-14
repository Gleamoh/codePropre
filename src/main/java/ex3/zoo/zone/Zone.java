package ex3.zoo.zone;

import java.util.ArrayList;
import java.util.List;

import ex3.zoo.animal.Animal;
import ex3.zoo.animal.IAnimal;

public abstract class Zone implements IZone {

	protected double kiloNourritureParJour;
	protected String Label;
	protected List<Animal> animauxList;

	public Zone(String label, double kiloNourritureParJour) {
		this.kiloNourritureParJour = kiloNourritureParJour;
		this.Label = label;
		animauxList = new ArrayList<>();
	}
	
	/**
	 * Ajoute un animal la liste
	 * @param animal
	 * @return vrai si l'animal est ajouté
	 */
	public abstract boolean addAnimal(IAnimal animal);

	/**
	 * @param kiloNourritureParJour
	 *            the kiloNourritureParJour to set
	 */
	public void setKiloNourritureParJour(double kiloNourritureParJour) {
		this.kiloNourritureParJour = kiloNourritureParJour;
	}
	
	/**
	 * @return double quantite de nourriture par jour
	 */
	public double calculerKiloNourritureParJour() {
		return animauxList.size() * kiloNourritureParJour;
	}
	
	public int compterAnimaux(){
		return animauxList.size();
	}

	/**
	 * @return the kiloNourritureParJour
	 */
	public double getKiloNourritureParJour() {
		return kiloNourritureParJour;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return Label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		Label = label;
	}

	public List<Animal> getAnimauxList() {
		return animauxList;
	}

	public void setAnimauxList(List<Animal> animauxList) {
		this.animauxList = animauxList;
	}
}
