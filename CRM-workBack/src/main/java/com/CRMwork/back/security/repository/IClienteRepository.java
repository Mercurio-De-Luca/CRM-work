package com.CRMwork.back.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CRMwork.back.security.entity.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
