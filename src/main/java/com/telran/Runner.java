package com.telran;

import com.telran.entity.embedded.AddressEmbedded;
import com.telran.entity.embedded.EmployeeEmbedded;
import com.telran.entity.reference.AddressReference;
import com.telran.entity.reference.EmployeeReference;
import com.telran.repository.AddressReferenceRepository;
import com.telran.repository.EmployeeEmbeddedRepository;
import com.telran.repository.EmployeeReferenceRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private EmployeeEmbeddedRepository employeeEmbeddedRepository;




    @Autowired
    private AddressReferenceRepository addressReferenceRepository;

    @Autowired
    private EmployeeReferenceRepository employeeReferenceRepository;



    @Override
    public void run(String... args) throws Exception {
        AddressReference addressReference = AddressReference
                .builder()
                .id(new ObjectId().toString())
                .city("Tel-Aviv")
                .street("Menahem Begin")
                .houseNumber("157")
                .build();

//        addressReferenceRepository.save(addressReference);

        //addressReference.getId() == null

        EmployeeReference employeeReference = EmployeeReference.builder()
                .firstName("Michael")
                .lastName("Dale")
                .addressReference(addressReference)
                .build();

        employeeReferenceRepository.save(employeeReference);
    }

    private void referenceExample() {
        AddressReference addressReference = AddressReference
                .builder()
                .city("Haifa")
                .street("Rotshild")
                .houseNumber("11A")
                .build();
        addressReferenceRepository.save(addressReference);

        EmployeeReference employeeReference = EmployeeReference.builder()
                .firstName("David")
                .lastName("Smith")
                .addressReference(addressReference)
                .build();

        employeeReferenceRepository.save(employeeReference);
    }



    private void embeddedExample() {
        AddressEmbedded addressEmbedded = AddressEmbedded.builder()
                .city("Haifa")
                .street("Rotshild")
                .houseNumber("11A")
                .build();


        EmployeeEmbedded employeeEmbedded = EmployeeEmbedded.builder()
                .firstName("David")
                .lastName("Smith")
                .addressEmbedded(addressEmbedded)
                .build();

        employeeEmbeddedRepository.save(employeeEmbedded);
    }
}
