package br.guedes.gestor.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAccount;
    private String accountDescription;
    private String accountType;
    private String openDate;
    private Integer isActive;

    @ManyToOne
    private User user;

    public Account() {
        super();
    }


    public Account(Long idAccount, String accountDescription, String accountType, String openDate, Integer isActive,
                   User user) {
        super();
        this.idAccount = idAccount;
        this.accountDescription = accountDescription;
        this.accountType = accountType;
        this.openDate = openDate;
        this.isActive = isActive;
        this.user = user;
    }


    public Long getIdAccount() {
        return idAccount;
    }


    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }


    public String getAccountDescription() {
        return accountDescription;
    }


    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }


    public String getAccountType() {
        return accountType;
    }


    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public String getOpenDate() {
        return openDate;
    }


    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }


    public Integer getIsActive() {
        return isActive;
    }


    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Account [idAccount=" + idAccount + ", accountDescription=" + accountDescription + ", accountType="
                + accountType + ", openDate=" + openDate + ", isActive=" + isActive + ", user=" + user + "]";
    }


}
