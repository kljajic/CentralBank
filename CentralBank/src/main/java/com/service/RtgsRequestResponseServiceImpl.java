package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.RtgsRequestResponse;
import com.repository.RtgsRequestResponseRepository;

@Service
public class RtgsRequestResponseServiceImpl implements RtgsRequestResponseService{
	
	private final RtgsRequestResponseRepository rtgsRequestResponseRepository;
	
	@Autowired
	public RtgsRequestResponseServiceImpl(RtgsRequestResponseRepository rtgsRequestResponseRepository) {
		this.rtgsRequestResponseRepository = rtgsRequestResponseRepository;
	}
	
	@Override
	public RtgsRequestResponse save(RtgsRequestResponse rtgsRequestReponse) {
		return rtgsRequestResponseRepository.save(rtgsRequestReponse);
	}

}
