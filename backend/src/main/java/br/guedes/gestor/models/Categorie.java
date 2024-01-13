package br.guedes.gestor.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tb_categories")
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String categorieDescription;
	private String categorieType;
	private Integer isActive;
	private Account account;

	public Categorie() {
		super();
	}

	public Categorie(Long idCategorie, String categorieDescription, String categorieType, Integer isActive,
			Account account) {
		super();
		this.idCategorie = idCategorie;
		this.categorieDescription = categorieDescription;
		this.categorieType = categorieType;
		this.isActive = isActive;
		this.account = account;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCategorieDescription() {
		return categorieDescription;
	}

	public void setCategorieDescription(String categorieDescription) {
		this.categorieDescription = categorieDescription;
	}

	public String getCategorieType() {
		return categorieType;
	}

	public void setCategorieType(String categorieType) {
		this.categorieType = categorieType;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Categories [idCategorie=" + idCategorie + ", categorieDescription=" + categorieDescription
				+ ", categorieType=" + categorieType + ", isActive=" + isActive + ", account=" + account + "]";
	}






}
