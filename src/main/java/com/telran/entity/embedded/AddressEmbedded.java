package com.telran.entity.embedded;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddressEmbedded {

    private String city;
    private String street;
    private String houseNumber;
}
