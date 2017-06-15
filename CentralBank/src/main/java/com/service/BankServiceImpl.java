package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Bank;
import com.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService{
	
	private final BankRepository bankRepository;
	
	@Autowired
	public BankServiceImpl(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}
	
	@Override
	public Bank findOne(Long id) {
		return bankRepository.findOne(id);
	}

	@Override
	public Bank findByTransactionAccountNumber(String identifier) {
		return bankRepository.findByTransactionAccountNumber(identifier);
	}
}
