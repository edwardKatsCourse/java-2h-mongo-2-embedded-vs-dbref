package com.telran.entity.reference;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@Document
public class EmployeeReference {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    @DBRef(lazy = true)
    private AddressReference addressReference;
}
