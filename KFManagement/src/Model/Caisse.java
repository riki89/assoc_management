package Model;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Caisse {

    /**
     * Default constructor
     */
    public Caisse() {
    }

    public Caisse(double montantTotal) {
		super();
		this.montantTotal = montantTotal;
	}

	/**
     * 
     */
    private double montantTotal;
    private List<Transaction> transactions = new ArrayList<Transaction>();


    /**
     * @param LocalDate
     */
    public void situationCaisse(LocalDate date) {
        // TODO implement here
    }

    /**
     * 
     */
    public void repartitionMontant() {
        // TODO implement here
    }

	public double getMontantTotal() {
		return montantTotal;
	}

	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}

}