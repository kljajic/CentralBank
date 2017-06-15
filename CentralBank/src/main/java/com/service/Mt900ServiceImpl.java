package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.Mt900Repository;
import com.xsdschemas.rtgsresponseoriginator.Mt900Response;

@Service
public class Mt900ServiceImpl implements Mt900Service{

	private final Mt900Repository mt900Repository;
	
	@Autowired
	public Mt900ServiceImpl(Mt900Repository mt900Repository) {
		this.mt900Repository = mt900Repository;
	}
	
	@Override
	public Mt900Response save(Mt900Response response) {
		return mt900Repository.save(response);
	}
	
}
