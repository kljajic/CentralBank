package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsdschemas.rtgsrequest.Mt103Request;

public interface Mt103Repository extends JpaRepository<Mt103Request, Long>{
	
}
