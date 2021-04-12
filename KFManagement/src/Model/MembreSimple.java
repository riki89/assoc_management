package Model;

import java.time.LocalDate;

/**
 * 
 */
public class MembreSimple extends Membre {

    /**
     * Default constructor
     */
    public MembreSimple() {
    }

	public MembreSimple(String nom, String prenom, String telephone, String sexe, LocalDate dateAdhesion,
			boolean carteMembre) {
		super(nom, prenom, telephone, sexe, dateAdhesion, carteMembre);
		// TODO Auto-generated constructor stub
	}

}