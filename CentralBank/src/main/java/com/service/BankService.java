package com.service;

import com.model.Bank;

public interface BankService {
	
	Bank findOne(Long id);
	
	Bank findByTransactionAccountNumber(String identifier);
	
}
