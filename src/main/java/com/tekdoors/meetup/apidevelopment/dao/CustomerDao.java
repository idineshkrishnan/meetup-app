package com.tekdoors.meetup.apidevelopment.dao;

import com.tekdoors.meetup.apidevelopment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
