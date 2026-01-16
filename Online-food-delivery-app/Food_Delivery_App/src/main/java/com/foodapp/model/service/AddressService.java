package com.foodapp.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.repository.AddressRepo; 
import org.springframework.web.bind.annotation.*; 
@Service
public class AddressService
  {
      @Autowired
      AddressRepo addressRepo;

    public Address addAddress(@RequestBody Address address){
        return addressRepo.save(address);
    }
  }
