package models;


import java.util.ArrayList;

/**
 * Modèle lié au formulaire {@link controllers.Ajout_materiel_controller}
 * @see Classes_ajout_bloc
 */
public class Materiel extends Commun {

	private String marque;
	private String modele;
	private String capacite;
	private boolean usb3;
	private boolean en_stock;
	private boolean hors_service;
	
	private ArrayList<String> tags;

	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
    /**
     * Retourne la liste des tags concernant le matériel
     * @see Destinataire#wrong_tags 
     * @return La liste des tags concernant le matériel
     */
	public ArrayList<String> getTags() {
		return tags;
	}

	/**
	 * Modifie la liste des tags concernant le matériel
	 * @param tags la liste des tags cochés dans le formulaire
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	/**
	 * Retourne true si le matériel est présent, false s'il est sorti.
	 * @return true si le matériel est présent, false s'il est sorti.
	 */
	public boolean isEn_stock() {
		return en_stock;
	}

	/**
	 * Modifie true si le matériel est présent, false s'il est sorti.
	 * @param en_stock true si le matériel est présent, false s'il est sorti.
	 */
	public void setEn_stock(boolean en_stock) {
		this.en_stock = en_stock;
	}

	/**
	 * Retourne true si le matériel est définitivement hors-service, false s'il est fonctionnel.
	 * @return true si le matériel est définitivement hors-service, false s'il est fonctionnel.
	 */
	public boolean isHors_service() {
		return hors_service;
	}

	/**
	 * Modifie le statut du materiel.
	 * @param hors_service le statut du materiel.
	 */
	public void setHors_service(boolean hors_service) {
		this.hors_service = hors_service;
	}

	public boolean isUsb3() {
		return usb3;
	}

	public void setUsb3(boolean usb3) {
		this.usb3 = usb3;
	}
	
    
}
