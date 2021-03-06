package ex3.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ex3.zoo.animal.Animal;
import ex3.zoo.animal.IAnimal;
import ex3.zoo.zone.AquariumZone;
import ex3.zoo.zone.CarnivoreZone;
import ex3.zoo.zone.FermeReptileZone;
import ex3.zoo.zone.SavaneAfricaineZone;
import ex3.zoo.zone.Zone;

/**
 * @author Kevin M.
 *
 */
public class Zoo {

	/**
	 * label : String le nom du zoo
	 */
	private String label;

	/**
	 * zonesList : List<Zone> la liste des zones du zoo
	 */
	private List<Zone> zonesList;

	/**
	 * Initialize le nom du zoo et creer les zones
	 * @param label - Nom
	 */
	public Zoo(String label) {
		this.label = label;
		zonesList = new ArrayList<>();
		zonesList.add(new AquariumZone());
		zonesList.add(new CarnivoreZone());
		zonesList.add(new FermeReptileZone());
		zonesList.add(new SavaneAfricaineZone());
	}

	/**
	 * @param animal - Ajouter un animal au zoo
	 */
	public void addAnimal(IAnimal animal) {
		zonesList.stream().forEach(zone -> zone.addAnimal(animal));
	}

	/**
	 * Afficher la list des animaux du zoo
	 */
	public void afficherListeAnimaux() {
		List<Animal> list = zonesList.stream().map(Zone::getAnimauxList).flatMap(l -> l.stream())
				.collect(Collectors.toList());
		list.stream().forEach(a -> System.out.println(a.toString()));
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the zonesList
	 */
	public List<Zone> getZonesList() {
		return zonesList;
	}

	/**
	 * @param zonesList
	 *            the zonesList to set
	 */
	public void setZonesList(List<Zone> zonesList) {
		this.zonesList = zonesList;
	}
}
