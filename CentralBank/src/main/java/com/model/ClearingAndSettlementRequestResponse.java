package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.xsdschemas.clearingandsettlement.Mt102Request;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Entity
public class ClearingAndSettlementRequestResponse {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(optional = false)
	Mt102Request mt102Request;
	
	@ManyToOne(optional = false)
	Mt900Response mt900Response;
	
	@ManyToOne(optional = false)
	Mt910Response mt910Response;
	
	@ManyToOne(optional = false)
	Bank recieverBank;
	
	@ManyToOne(optional = false)
	Bank originatorBank;
	
	public ClearingAndSettlementRequestResponse() {}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mt102Request getMt102Request() {
		return mt102Request;
	}

	public void setMt102Request(Mt102Request mt102Request) {
		this.mt102Request = mt102Request;
	}

	public Mt900Response getMt900Response() {
		return mt900Response;
	}

	public void setMt900Response(Mt900Response mt900Response) {
		this.mt900Response = mt900Response;
	}

	public Mt910Response getMt910Response() {
		return mt910Response;
	}

	public void setMt910Response(Mt910Response mt910Response) {
		this.mt910Response = mt910Response;
	}
	
	public Bank getRecieverBank() {
		return recieverBank;
	}

	public void setRecieverBank(Bank recieverBank) {
		this.recieverBank = recieverBank;
	}

	public Bank getOriginatorBank() {
		return originatorBank;
	}

	public void setOriginatorBank(Bank originatorBank) {
		this.originatorBank = originatorBank;
	}

	
}
