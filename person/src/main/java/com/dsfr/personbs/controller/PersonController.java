package com.dsfr.personbs.controller;

import com.dsfr.personbs.model.Person;
import com.dsfr.personbs.services.AddressServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("v1")
public class PersonController {

    @Autowired
    private AddressServices addressServices;

    @GetMapping("getPersonById/{id}")
    public Person getPerson(@PathVariable("id") Long id){

        return new Person(id,"eren", addressServices.getAllAddresses() );

    }

    @GetMapping("getPersons")
    public List<Person> getPersons(){
        log.info("Person services run.");
        return Arrays.asList(
                new Person(1L,"eren", addressServices.getAllAddresses() )
        );
    }

}
