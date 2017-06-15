package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsdschemas.rtgsresponseoriginator.Mt900Response;

public interface Mt900Repository extends JpaRepository<Mt900Response, Long>{

}
