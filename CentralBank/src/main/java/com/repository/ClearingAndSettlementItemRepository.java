package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsdschemas.clearingandsettlementitem.ClearingAndSettlementItem;

public interface ClearingAndSettlementItemRepository  extends JpaRepository<ClearingAndSettlementItem, Long> {

}
