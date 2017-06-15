package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsdschemas.clearingandsettlement.Mt102Request;

public interface Mt102Repository extends JpaRepository<Mt102Request, Long>{

}
