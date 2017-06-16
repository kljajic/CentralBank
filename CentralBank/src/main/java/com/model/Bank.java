package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.validator.constraints.Email;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	@Size(min=1, max=13)
	private String pib;
	
	@Column(nullable = false)
	@Size(min=1, max=120)
	private String name;
	
	@Column(nullable = false)
	@Size(min=1, max=120)
	private String address;
	
	@Column(nullable = false)
	@Size(min=1, max=70)
	private String email;
	
	@Column(nullable = false)
	@Size(min=1, max=120)
	private String web;
	
	@Column(nullable = false)
	@Size(min=1, max=20)
	private String telephone;
	
	@Column(nullable = false)
	@Size(min=1, max=100)
	private String fax;

	@Column(nullable = false)
	@Size(min=1, max=8)
	private String swift;

	@Column(nullable = false)
	@Size(min=1, max=20)
	private String transactionAccount;
	
	@Column(nullable = false)
	private boolean active;
	
	@Column(nullable = false)
	@Size(min=1, max=255)
	private String mt103Service;
	
	@Column(nullable = false)
	@Size(min=1, max=255)
	private String mt910Service;
	
	public Bank() {	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "recieverBank", orphanRemoval = true, targetEntity = ClearingAndSettlementRequestResponse.class)
    protected Set<ClearingAndSettlementRequestResponse> recieverClearingAndSettlementRequestResponse;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "originatorBank", orphanRemoval = true, targetEntity = ClearingAndSettlementRequestResponse.class)
    protected Set<ClearingAndSettlementRequestResponse> originatorClearingAndSettlementRequestResponse;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "recieverBank", orphanRemoval = true, targetEntity = RtgsRequestResponse.class)
    protected Set<RtgsRequestResponse> recieverRtgsRequestResponse;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "originatorBank", orphanRemoval = true, targetEntity = RtgsRequestResponse.class)
    protected Set<RtgsRequestResponse> originatorRtgsRequestResponse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public String getTransactionAccount() {
		return transactionAccount;
	}

	public void setTransactionAccount(String transactionAccount) {
		this.transactionAccount = transactionAccount;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getMt103Service() {
		return mt103Service;
	}

	public void setMt103Service(String mt103Service) {
		this.mt103Service = mt103Service;
	}

	public String getMt910Service() {
		return mt910Service;
	}

	public void setMt910Service(String mt910Service) {
		this.mt910Service = mt910Service;
	}
}
