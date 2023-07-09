package com.geekster.MyntraClone2.Controller;

import com.geekster.MyntraClone2.Models.Address;
import com.geekster.MyntraClone2.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping()
    public void addAddress(@RequestBody Address address){
        addressService.insertAddress(address);
    }
}
