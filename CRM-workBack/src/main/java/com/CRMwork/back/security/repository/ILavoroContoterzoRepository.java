package com.CRMwork.back.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CRMwork.back.security.entity.LavoroContoterzo;

@Repository
public interface ILavoroContoterzoRepository extends CrudRepository<LavoroContoterzo, Long> {

}
