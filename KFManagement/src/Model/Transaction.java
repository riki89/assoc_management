package Model;

import java.time.LocalDate;

/**
 * 
 */
public class Transaction {

    /**
     * Default constructor
     */
    public Transaction() {
    }

    public Transaction(String sens, String motif, double montant, LocalDate date, Caisse caisse) {
		super();
		this.sens = sens;
		this.motif = motif;
		this.montant = montant;
		this.date = date;
		this.caisse = caisse;
	}

	/**
     * 
     */
    public String sens;

    /**
     * 
     */
    public String motif;

    /**
     * 
     */
    public double montant;

    /**
     * 
     */
    public LocalDate date;
    
    private Caisse caisse;
    private Membre effectuePar;
    
	public String getSens() {
		return sens;
	}

	public void setSens(String sens) {
		this.sens = sens;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
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

	public Caisse getCaisse() {
		return caisse;
	}

	public void setCaisse(Caisse caisse) {
		this.caisse = caisse;
	}

	public Membre getEffectuePar() {
		return effectuePar;
	}

	public void setEffectuePar(Membre effectuePar) {
		this.effectuePar = effectuePar;
	}


}