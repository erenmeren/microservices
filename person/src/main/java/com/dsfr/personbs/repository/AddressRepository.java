package com.dsfr.personbs.repository;

import com.dsfr.personbs.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="address")
public interface AddressRepository {

    @GetMapping("v1/getAllAddresses")
    List<Address> getAllAddresses();

}
