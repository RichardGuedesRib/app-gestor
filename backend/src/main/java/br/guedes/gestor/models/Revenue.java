package br.guedes.gestor.models;

import jakarta.persistence.Table;

@Table(name = "tb_revenues")
public class Revenue extends Register {

	private Long idRevenue;
	private Account account;
	private String receiptDate;
	private Categorie categorie;
	private Integer isActive;

	public Revenue() {
		super();
	}

	public Revenue(Long idRevenue, Account account, String receiptDate, Categorie categorie, Integer isActive) {
		super();
		this.idRevenue = idRevenue;
		this.account = account;
		this.receiptDate = receiptDate;
		this.categorie = categorie;
		this.isActive = isActive;
	}

	public Long getIdRevenue() {
		return idRevenue;
	}

	public void setIdRevenue(Long idRevenue) {
		this.idRevenue = idRevenue;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Revenue [idRevenue=" + idRevenue + ", account=" + account + ", receiptDate=" + receiptDate
				+ ", categorie=" + categorie + ", isActive=" + isActive + "]";
	}







}
