package com.xsdschemas;

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
	
	//dodaj oneToMany
	@ManyToOne(optional = false)
	Mt900Response mt900Response;
	
	//dodaj oneToMany
	@ManyToOne(optional = false)
	Mt910Response mt910Response;
	
}
