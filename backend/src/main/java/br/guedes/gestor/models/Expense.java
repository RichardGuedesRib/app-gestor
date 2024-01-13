package br.guedes.gestor.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tb_expenses")
public class Expense extends Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExpense;
	private String duoDate;
	private Account account;
	private Integer isActive;
	private Categorie categorie;
	
	public Expense() {
		super();
	}

	public Expense(Long idExpense, String duoDate, Account account, Integer isActive) {
		super();
		this.idExpense = idExpense;
		this.duoDate = duoDate;
		this.account = account;
		this.isActive = isActive;
	}

	public Long getIdExpense() {
		return idExpense;
	}

	public void setIdExpense(Long idExpense) {
		this.idExpense = idExpense;
	}

	public String getDuoDate() {
		return duoDate;
	}

	public void setDuoDate(String duoDate) {
		this.duoDate = duoDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Expenses [idExpense=" + idExpense + ", duoDate=" + duoDate + ", account=" + account + ", isActive="
				+ isActive + ", categorie=" + categorie + "]";
	}
	
	
	

	
	

}
