package fr.eni.zylim.encheres.bo;

import java.sql.Date;

public class ArticleVendu {
	private int no_article;
	private String nom_article;
	private String description;
	private Date date_debut_encheres;
	private Date date_fin_encheres;

	private int prix_initial ;
	private int prix_vente ;
	private int no_utilisateur ;
	private int no_categorie ;
	private boolean etat_vente ;
    private Retrait retrait;
    private String image_article;
   


	public String getImage_article() {
		return image_article;
	}

	public void setImage_article(String image_article) {
		this.image_article = image_article;
	}

	public int getNo_article() {
		return no_article;
	}

	public String getNom_article() {
		return nom_article;
	}

	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_debut_encheres() {
		return date_debut_encheres;
	}

	public void setDate_debut_encheres(Date date_debut_encheres) {
		this.date_debut_encheres = date_debut_encheres;
	}

	public Date getDate_fin_encheres() {
		return date_fin_encheres;
	}

	public void setDate_fin_encheres(Date date_fin_encheres) {
		this.date_fin_encheres = date_fin_encheres;
	}

	public int getPrix_initial() {
		return prix_initial;
	}

	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}

	public int getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
	}

	public int getNo_utilisateur() {
		return no_utilisateur;
	}

	public void setNo_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public int getNo_categorie() {
		return no_categorie;
	}

	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}

	public boolean isEtat_vente() {
		return etat_vente;
	}

	public void setEtat_vente(boolean etat_vente) {
		this.etat_vente = etat_vente;
	}

	public Retrait getRetrait() {
		return retrait;
	}

	public void setRetrait(Retrait retrait) {
		this.retrait = retrait;
	}

	public void setNo_article(int no_article) {
		this.no_article = no_article;
	}

	public ArticleVendu() {
		super();
	}

	
//	
//	public ArticleVendu( int no_article, String nom_article, String description, Date date_debut_encheres,
//			Date date_fin_encheres, int prix_initial,int prix_vente,  int no_utilisateur, int no_categorie,
//			boolean etat_vente,Retrait retrait) {
//	
//		this(no_article,nom_article,description,date_debut_encheres,date_fin_encheres, prix_initial,prix_vente,no_utilisateur,no_categorie,etat_vente);
//		this.retrait = retrait;
//
//	}
	public ArticleVendu(int no_article,String nom_article, String description, Date date_debut_encheres,
			Date date_fin_encheres, int prix_initial,int prix_vente, int no_utilisateur, int no_categorie,
			 boolean etat_vente, String image_article) {
	this.no_article = no_article;
		this.nom_article = nom_article;
		this.description = description;
		this.date_debut_encheres = date_debut_encheres;
		this.date_fin_encheres = date_fin_encheres;
		this.prix_initial = prix_initial;
		this.prix_vente= prix_vente;
		this.no_utilisateur = no_utilisateur;
		this.no_categorie = no_categorie;
		this.etat_vente = etat_vente;
		this.image_article = image_article;
	}
	


	public ArticleVendu(int no_article, String nom_article, String description, Date date_debut_encheres,
			Date date_fin_encheres, int prix_initial, int prix_vente, int no_categorie, boolean etat_vente) {
		this.no_article = no_article;
		this.nom_article = nom_article;
		this.description = description;
		this.date_debut_encheres = date_debut_encheres;
		this.date_fin_encheres = date_fin_encheres;
		this.prix_initial = prix_initial;
		this.prix_vente= prix_vente;
		this.no_categorie = no_categorie;
		this.etat_vente = etat_vente;
		
	}

	@Override
	public String toString() {
		return "Article [no_article=" + no_article + ", nom_article=" + nom_article + ", description=" + description
				+ ", date_debut_encheres=" + date_debut_encheres + ", date_fin_encheres=" + date_fin_encheres
				+ ", prix_initial=" + prix_initial + ", prix_vente=" + prix_vente + ", no_utilisateur=" + no_utilisateur
				+ ", no_categorie=" + no_categorie + "]";
	}

	
}
