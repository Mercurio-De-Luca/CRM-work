package com.CRMwork.back.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CRMwork.back.security.entity.Terreno;

@Repository
public interface ITerrenoRepository extends CrudRepository<Terreno, Long>  {

}
