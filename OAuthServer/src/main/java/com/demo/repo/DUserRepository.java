package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.models.DUserDtlsEntity;

public interface DUserRepository extends CrudRepository<DUserDtlsEntity, Long> {

	DUserDtlsEntity findByUsername(String username);

}
