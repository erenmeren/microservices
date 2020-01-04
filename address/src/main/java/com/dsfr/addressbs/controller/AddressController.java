package com.dsfr.addressbs.controller;

import com.dsfr.addressbs.model.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("v1")
public class AddressController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("getAddressById/{id}")
    public Address getAddress(@PathVariable Long id){

        log.info("Address service run on {} port", serverPort);

        return new Address(id, "NG2 2HX");
    }

    @GetMapping("getAllAddresses")
    public List<Address> getAddresses(){

        log.info("Address service run on {} port", serverPort);

        return Arrays.asList(
                new Address(1L, "NG2 2HX"),
                new Address(2L, "EX1 2QY"),
                new Address(3L, "LON RTW")
        );
    }

}
