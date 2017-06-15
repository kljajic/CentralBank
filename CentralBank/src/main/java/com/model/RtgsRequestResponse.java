package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.xsdschemas.rtgsrequest.Mt103Request;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Entity
public class RtgsRequestResponse {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne(optional=false)
	private Mt103Request mt103Request;
	
	@ManyToOne(optional=true)
	private Mt900Response mt900Response;
	
	@ManyToOne(optional=true)
	private Mt910Response mt910Response;
	
	@ManyToOne(optional = false)
	Bank recieverBank;
	
	@ManyToOne(optional = false)
	Bank originatorBank;
	
	public RtgsRequestResponse() {	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Mt103Request getMt103Request() {
		return mt103Request;
	}
	
	public void setMt103Request(Mt103Request mt103Request) {
		this.mt103Request = mt103Request;
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
