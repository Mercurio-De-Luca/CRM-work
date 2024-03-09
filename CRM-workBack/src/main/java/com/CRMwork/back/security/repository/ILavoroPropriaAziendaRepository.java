package com.CRMwork.back.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CRMwork.back.security.entity.LavoroPropriaAzienda;

@Repository
public interface ILavoroPropriaAziendaRepository extends CrudRepository<LavoroPropriaAzienda, Long> {

}
