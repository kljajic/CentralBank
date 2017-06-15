package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsdschemas.rtgsresponsereciever.Mt910Response;

public interface Mt910Repository extends JpaRepository<Mt910Response, Long>{

}
