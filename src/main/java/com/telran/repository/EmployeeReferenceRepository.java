package com.telran.repository;

import com.telran.entity.reference.EmployeeReference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeReferenceRepository extends MongoRepository<EmployeeReference, String> {
}
