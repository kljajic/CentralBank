package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{
	
	@Query("select bank from Bank bank where substring(bank.transactionAccount, 1, 3)=?1")
	public Bank findByTransactionAccountNumber(String identifier);
}
