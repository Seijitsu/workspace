package entreprise0;

public class Employes {
	private String nom;
	private String prenom;
	private String poste;
	private int nbEmp=0;
	
	public Employes()
	{
		nom="";
		prenom="";
		poste="";
		
	}
	
	public Employes(String pNom, String pPrenom, String pPoste)
	{
		this.setEmployes(pNom,pPrenom,pPoste);
		nbEmp++;
	}
	
	public void setEmployes(String pNom, String pPrenom, String pPoste)
	{
		this.nom=pNom;
		this.prenom=pPrenom;
		this.poste=pPoste;
	}
	
	public String getEmployes()
	{
		return this.nom+" "+this.prenom+" "+this.poste+" "+nbEmp+" ";
	}
	
	public String toString()
	{
		String liste;
		liste = "";
		liste += this.getEmployes();
		return liste;
	}
}
