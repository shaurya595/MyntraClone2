package com.geekster.MyntraClone2.Service;

import com.geekster.MyntraClone2.Models.Address;
import com.geekster.MyntraClone2.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public void insertAddress(Address address) {
        addressRepo.save(address);
    }
}
