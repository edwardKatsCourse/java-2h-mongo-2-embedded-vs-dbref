package com.telran.repository;

import com.telran.entity.reference.AddressReference;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressReferenceRepository extends MongoRepository<AddressReference, String> {
}
