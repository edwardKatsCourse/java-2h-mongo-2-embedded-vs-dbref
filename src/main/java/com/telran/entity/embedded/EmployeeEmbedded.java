package com.telran.entity.embedded;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@Document
public class EmployeeEmbedded {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private AddressEmbedded addressEmbedded;
}
