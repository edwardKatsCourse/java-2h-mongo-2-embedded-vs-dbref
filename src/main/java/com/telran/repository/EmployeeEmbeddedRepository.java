package com.telran.repository;

import com.telran.entity.embedded.EmployeeEmbedded;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeEmbeddedRepository extends MongoRepository<EmployeeEmbedded, String> {
}
