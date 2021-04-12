package Model;


import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Activity {

    /**
     * Default constructor
     */
    public Activity() {
    }

    /**
     * 
     */
    private LocalDate date;

    /**
     * 
     */
    private String lieu;
    private CompteRendu compteRendu;
    private List<Membre> participants = new ArrayList<Membre>();


    public Activity(LocalDate date, String lieu) {
		super();
		this.date = date;
		this.lieu = lieu;
	}



	/**
     * 
     */
    public void calculerNombreParticipant() {
        // TODO implement here
    }



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getLieu() {
		return lieu;
	}



	public void setLieu(String lieu) {
		this.lieu = lieu;
	}



	public List<Membre> getParticipants() {
		return participants;
	}



	public void addParticipant(Membre participant) {
		this.participants.add(participant);
	}



	public CompteRendu getCompteRendu() {
		return compteRendu;
	}



	public void setCompteRendu(CompteRendu compteRendu) {
		this.compteRendu = compteRendu;
	}



	public void setParticipants(List<Membre> participants) {
		this.participants = participants;
	}

}