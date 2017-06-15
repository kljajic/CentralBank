package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.Mt910Repository;
import com.xsdschemas.rtgsresponsereciever.Mt910Response;

@Service
public class Mt910ServiceImpl implements Mt910Service {

	private final Mt910Repository mt910Repository;
	
	@Autowired
	public Mt910ServiceImpl(Mt910Repository mt910Repository) {
		this.mt910Repository = mt910Repository;
	}
	
	@Override
	public Mt910Response save(Mt910Response mt910Response) {
		return mt910Repository.save(mt910Response);
	}

}
