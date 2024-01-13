package br.guedes.gestor.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idUser;
	private String firstnameUser;
	private String lastnameUser;
	private String emailUser;
	private String passwordUser;
	private String phoneUser;
	private Integer isActive;

	public User() {
		super();
	}

	public User(Long idUser, String firstnameUser, String lastnameUser, String emailUser, String passwordUser,
			String phoneUser, Integer isActive) {
		super();
		this.idUser = idUser;
		this.firstnameUser = firstnameUser;
		this.lastnameUser = lastnameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
		this.phoneUser = phoneUser;
		this.isActive = isActive;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getFirstnameUser() {
		return firstnameUser;
	}

	public void setFirstnameUser(String firstnameUser) {
		this.firstnameUser = firstnameUser;
	}

	public String getLastnameUser() {
		return lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getPhoneUser() {
		return phoneUser;
	}

	public void setPhoneUser(String phoneUser) {
		this.phoneUser = phoneUser;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstnameUser=" + firstnameUser + ", lastnameUser=" + lastnameUser
				+ ", emailUser=" + emailUser + ", passwordUser=" + passwordUser + ", phoneUser=" + phoneUser
				+ ", isActive=" + isActive + "]";
	}
	
	
	
}

	