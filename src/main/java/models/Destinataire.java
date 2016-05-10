package models;

import java.util.ArrayList;

/**
 * Modèle lié au formulaire {@link controllers.Ajout_destinataire_controller}
 * @see Classes_ajout_bloc
 */
public class Destinataire extends Commun {
    
	private String patronyme;
	private String prenom;
	private String fonction;
	private String societe;
	private boolean usb3;
	
	private ArrayList<String> wrong_tags;


	public String getPrenom() {
		return prenom == null || prenom.trim().equals("" ) ? null : prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction == null || fonction.trim().equals("" ) ? null : fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getSociete() {
		return societe == null || societe.trim().equals("") ? null : societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getPatronyme() {
		return patronyme == null || patronyme.trim().equals("") ? null : patronyme ;
	}
	
	public void setPatronyme(String patronyme) {
		this.patronyme = patronyme;
	}
    
	@Override
	public String getNom() {
		return getPatronyme() != null ? patronyme :
				 getSociete() != null ? societe :
				  getPrenom() != null ? prenom : "";
	}
	
	public ArrayList<String> getTags() {
		return wrong_tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.wrong_tags = tags;
	}

	public boolean isUsb3() {
		return usb3;
	}

	public void setUsb3(boolean usb3) {
		this.usb3 = usb3;
	}
}
