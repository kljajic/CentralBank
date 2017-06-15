package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.Mt103Repository;
import com.xsdschemas.rtgsrequest.Mt103Request;

@Service
public class Mt103ServiceImpl implements Mt103Service{

	private final Mt103Repository mt103Repository;
	
	@Autowired
	public Mt103ServiceImpl(Mt103Repository mt103Repository) {
		this.mt103Repository = mt103Repository;
	}
	
	@Override
	public Mt103Request save(Mt103Request mt103Request) {
		return mt103Repository.save(mt103Request);
	}

}
