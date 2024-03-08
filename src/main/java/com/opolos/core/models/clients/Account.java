package com.opolos.core.models.clients;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "accounts", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "id")
    })
public class Account {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private long id;


  private String client_id;
  private String creation;
  private String account;
  private String account_logo;
  private String c_operation;
  private String r_operation;
  private String d_operation;
  private String main_account_contact;
  private String main_email;
  private String main_tel;
  private String acc_status;

public Account(String client_id, String creation, String account, String account_logo, String c_operation,
        String r_operation, String d_operation, String main_account_contact, String main_email, String main_tel,
        String acc_status) {
    this.client_id = client_id;
    this.creation = creation;
    this.account = account;
    this.account_logo = account_logo;
    this.c_operation = c_operation;
    this.r_operation = r_operation;
    this.d_operation = d_operation;
    this.main_account_contact = main_account_contact;
    this.main_email = main_email;
    this.main_tel = main_tel;
    this.acc_status = acc_status;
}

public String getClient_id() {
    return client_id;
}

public void setClient_id(String client_id) {
    this.client_id = client_id;
}

public String getCreation() {
    return creation;
}

public void setCreation(String creation) {
    this.creation = creation;
}

public String getAccount() {
    return account;
}

public void setAccount(String account) {
    this.account = account;
}

public String getAccount_logo() {
    return account_logo;
}

public void setAccount_logo(String account_logo) {
    this.account_logo = account_logo;
}

public String getC_operation() {
    return c_operation;
}

public void setC_operation(String c_operation) {
    this.c_operation = c_operation;
}

public String getR_operation() {
    return r_operation;
}

public void setR_operation(String r_operation) {
    this.r_operation = r_operation;
}

public String getD_operation() {
    return d_operation;
}

public void setD_operation(String d_operation) {
    this.d_operation = d_operation;
}

public String getMain_account_contact() {
    return main_account_contact;
}

public void setMain_account_contact(String main_account_contact) {
    this.main_account_contact = main_account_contact;
}

public String getMain_email() {
    return main_email;
}

public void setMain_email(String main_email) {
    this.main_email = main_email;
}

public String getMain_tel() {
    return main_tel;
}

public void setMain_tel(String main_tel) {
    this.main_tel = main_tel;
}

public String getAcc_status() {
    return acc_status;
}

public void setAcc_status(String acc_status) {
    this.acc_status = acc_status;
}



  
    
}
