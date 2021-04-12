package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Membre {

    /**
     * Default constructor
     */
	public Membre() {
    }

    /**
     * 
     */
	private String nom;

    /**
     * 
     */
	private String prenom;

    /**
     * 
     */
    private String telephone;

    /**
     * 
     */
    private String sexe;

    /**
     * 
     */
    private LocalDate dateAdhesion;

    /**
     * 
     */
    private boolean carteMembre;
    private Transaction transaction = new Transaction();
    private List<RegleGroupe> regleGroups = new ArrayList<RegleGroupe>();
    private List<Activity> activities = new ArrayList<Activity>();
    private List<Cotisation> cotisations = new ArrayList<Cotisation>();

    public Membre(String nom, String prenom, String telephone, String sexe, LocalDate dateAdhesion,
			boolean carteMembre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.sexe = sexe;
		this.dateAdhesion = dateAdhesion;
		this.carteMembre = carteMembre;
	}
    /**
     * 
     */
    public void membreAvecCarte() {
        // TODO implement here
    }

	/**
     * 
     */
    public void membreSansCarte() {
        // TODO implement here
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public LocalDate getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(LocalDate dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public boolean isCarteMembre() {
		return carteMembre;
	}

	public void setCarteMembre(boolean carteMembre) {
		this.carteMembre = carteMembre;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public List<RegleGroupe> getRegleGroups() {
		return regleGroups;
	}
	public void addRegle(RegleGroupe regle) {
		this.regleGroups.add(regle);
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void addActivity(Activity activity) {
		this.activities.add(activity);
	}
	public List<Cotisation> getCotisations() {
		return cotisations;
	}
	public void addCotisation(Cotisation cotisation) {
		this.cotisations.add(cotisation);
	}

}