package Model;

import java.time.LocalDate;

/**
 * 
 */
public class MembreBureau extends Membre {

    /**
     * Default constructor
     */
    public MembreBureau() {
    }

    public MembreBureau(String nom, String prenom, String telephone, String sexe, LocalDate dateAdhesion,
			boolean carteMembre, String fonction) {
		super(nom, prenom, telephone, sexe, dateAdhesion, carteMembre);
		// TODO Auto-generated constructor stub
		this.fonction = fonction;
	}

	/**
     * 
     */
    private String fonction;

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}