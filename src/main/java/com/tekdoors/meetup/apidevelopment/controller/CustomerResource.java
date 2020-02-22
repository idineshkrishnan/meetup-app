package com.tekdoors.meetup.apidevelopment.controller;

import com.tekdoors.meetup.apidevelopment.model.Customer;
import com.tekdoors.meetup.apidevelopment.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/customers"})
public class CustomerResource {

    private CustomerService customerService;

    public CustomerResource(CustomerService service) {
        this.customerService = service;
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Customer customer) {
        return ResponseEntity.ok().body(customerService.addCustomer(customer));
    }

    @GetMapping
    public ResponseEntity getAll()  {
        return ResponseEntity.ok().body(customerService.getCustomers());
    }
}
