package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.ProrrogaModel;

@Repository
public interface ProrrogaRepository extends CrudRepository<ProrrogaModel, Long> {
    
}
