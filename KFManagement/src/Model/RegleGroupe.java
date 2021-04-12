package Model;

/**
 * 
 */
public class RegleGroupe {

    /**
     * Default constructor
     */
    public RegleGroupe() {
    }

    public RegleGroupe(String titre, String detail) {
		super();
		this.titre = titre;
		this.detail = detail;
	}

	/**
     * 
     */
    private String titre;

    /**
     * 
     */
    private String detail;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
    

}