package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.Mt102Repository;
import com.xsdschemas.clearingandsettlement.Mt102Request;

@Service
public class Mt102ServiceImpl implements Mt102Service {

	@Autowired
	private Mt102Repository mt102Repository;
	
	@Override
	public Mt102Request save(Mt102Request mt102Request) {
		// TODO Auto-generated method stub
		return mt102Repository.save(mt102Request);
	}

}
