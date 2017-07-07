package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ClearingAndSettlementItemRepository;
import com.xsdschemas.clearingandsettlementitem.ClearingAndSettlementItem;

@Service
public class ClearingAndSettlementItemServiceImpl implements ClearingAndSettlementItemService{

	@Autowired
	private ClearingAndSettlementItemRepository clearingAndSettlementItemRepository;
	
	@Override
	public ClearingAndSettlementItem save(ClearingAndSettlementItem clearingAndSettlementItem) {
		return clearingAndSettlementItemRepository.save(clearingAndSettlementItem);
	}
	
}
