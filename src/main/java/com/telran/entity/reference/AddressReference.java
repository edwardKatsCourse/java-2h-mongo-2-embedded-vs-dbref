package com.telran.entity.reference;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
//@Getter
@Setter
@Builder

@Document
public class AddressReference {

    @Id
    private String id;

    private String city;
    private String street;
    private String houseNumber;

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
