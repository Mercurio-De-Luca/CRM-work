package com.CRMwork.back.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CRMwork.back.security.entity.Mezzo;

@Repository
public interface IMezzoRepository extends CrudRepository<Mezzo, Long> {

}
