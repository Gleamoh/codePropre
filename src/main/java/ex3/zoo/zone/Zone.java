package ex3.zoo.zone;

import java.util.ArrayList;
import java.util.List;

import ex3.zoo.animal.Animal;
import ex3.zoo.animal.IAnimal;

/**
 * @author Kevin M.
 *
 */
public abstract class Zone implements IZone {

	/**
	 * kiloNourritureParJour : double
	 */
	protected double kiloNourritureParJour;
	/**
	 * Label : String non de la zone
	 */
	protected String Label;
	/**
	 * animauxList : List<Animal>
	 */
	protected List<Animal> animauxList;

	/**
	 * Constructor
	 * 
	 * @param label label
	 * @param kiloNourritureParJour kiloNourritureParJour
	 */
	public Zone(String label, double kiloNourritureParJour) {
		this.kiloNourritureParJour = kiloNourritureParJour;
		this.Label = label;
		animauxList = new ArrayList<>();
	}

	/**
	 * Ajoute un animal la liste
	 * 
	 * @param animal animal
	 * @return vrai si l'animal est ajouté
	 */
	public abstract boolean addAnimal(IAnimal animal);

	/**
	 * @param kiloNourritureParJour
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

	/**
	 * @return : int
	 */
	public int compterAnimaux() {
		return animauxList.size();
	}

	/**
	 * @return : double
	 */
	public double getKiloNourritureParJour() {
		return kiloNourritureParJour;
	}

	/**
	 * @return : String
	 */
	public String getLabel() {
		return Label;
	}

	/**
	 * @param label
	 */
	public void setLabel(String label) {
		Label = label;
	}

	/**
	 * @return : List<Animal>
	 */
	public List<Animal> getAnimauxList() {
		return animauxList;
	}

	/**
	 * @param animauxList animauxList
	 */
	public void setAnimauxList(List<Animal> animauxList) {
		this.animauxList = animauxList;
	}
}
