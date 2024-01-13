package br.guedes.gestor.models;

import jakarta.persistence.Table;

@Table(name = "tb_registers")
public class Register {
	
	
	private Long idRegister;
	private String registerDescription;
	private Double registerValue;
	private String receiptDate;
	private Integer isActive;
	private Account account;
	
	public Register() {
		super();
	}


	public Register(Long idRegister, String registerDescription, Double registerValue, String receiptDate,
			Integer isActive, Account account) {
		super();
		this.idRegister = idRegister;
		this.registerDescription = registerDescription;
		this.registerValue = registerValue;
		this.receiptDate = receiptDate;
		this.isActive = isActive;
		this.account = account;
	}



	public Long getIdRegister() {
		return idRegister;
	}


	public void setIdRegister(Long idRegister) {
		this.idRegister = idRegister;
	}


	public String getRegisterDescription() {
		return registerDescription;
	}


	public void setRegisterDescription(String registerDescription) {
		this.registerDescription = registerDescription;
	}


	public Double getRegisterValue() {
		return registerValue;
	}


	public void setRegisterValue(Double registerValue) {
		this.registerValue = registerValue;
	}


	public String getReceiptDate() {
		return receiptDate;
	}


	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
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
		return "Register [idRegister=" + idRegister + ", registerDescription=" + registerDescription
				+ ", registerValue=" + registerValue + ", receiptDate=" + receiptDate + ", isActive=" + isActive
				+ ", account=" + account + "]";
	}



	
	
	
	
	

}
