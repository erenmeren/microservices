package com.dsfr.personbs.services;

import com.dsfr.personbs.model.Address;
import com.dsfr.personbs.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServicesImpl implements AddressServices {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.getAllAddresses();
    }
}
