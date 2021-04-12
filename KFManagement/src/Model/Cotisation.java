package Model;

import java.time.LocalDate;

/**
 * 
 */
public class Cotisation {

    /**
     * Default constructor
     */
    public Cotisation() {
    }

    public Cotisation(int mois, double montant, LocalDate date, String moyenVersement, String description, Membre membre) {
		super();
		this.mois = mois;
		this.montant = montant;
		this.date = date;
		this.moyenVersement = moyenVersement;
		this.description = description;
		this.membre = membre;
	}
    
    public Cotisation(int mois, double montant, LocalDate date, String moyenVersement, String description) {
		super();
		this.mois = mois;
		this.montant = montant;
		this.date = date;
		this.moyenVersement = moyenVersement;
		this.description = description;
		//this.membre = membre;
	}

	/**
     * 
     */
    private int mois;

    /**
     * 
     */
    private double montant;

    /**
     * 
     */
    private LocalDate date;

    /**
     * 
     */
    private String moyenVersement;

    /**
     * 
     */
    private String description;
    
    private Membre membre;
    private Membre encaissePar;
    



    /**
     * @return
     */
    public double totalMensuel() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double cotisationTotale() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double totalDurantReunion() {
        // TODO implement here
        return 0.0d;
    }

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMoyenVersement() {
		return moyenVersement;
	}

	public void setMoyenVersement(String moyenVersement) {
		this.moyenVersement = moyenVersement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public Membre getEncaissePar() {
		return encaissePar;
	}

	public void setEncaissePar(Membre encaissePar) {
		this.encaissePar = encaissePar;
	}

}