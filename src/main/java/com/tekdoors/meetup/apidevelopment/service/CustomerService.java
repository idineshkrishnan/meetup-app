package com.tekdoors.meetup.apidevelopment.service;

import com.tekdoors.meetup.apidevelopment.dao.CustomerDao;
import com.tekdoors.meetup.apidevelopment.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Customer addCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerDao.findAll();
    }
}
