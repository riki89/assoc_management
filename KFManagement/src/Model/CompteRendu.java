package Model;

/**
 * 
 */
public class CompteRendu {

    /**
     * Default constructor
     */
    public CompteRendu() {
    }

    public CompteRendu(String ordreDJour, String resume) {
		super();
		this.ordreDJour = ordreDJour;
		this.resume = resume;
	}

	/**
     * 
     */
    private String ordreDJour;

    /**
     * 
     */
    private String resume;

	public String getOrdreDJour() {
		return ordreDJour;
	}

	public void setOrdreDJour(String ordreDJour) {
		this.ordreDJour = ordreDJour;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

}