package com.group3.rentngo.service.impl;

import com.group3.rentngo.repository.BookingRepository;
import com.group3.rentngo.repository.CustomerRepository;
import com.group3.rentngo.repository.UserRepository;
import com.group3.rentngo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private UserRepository userRepository;
    private BookingRepository bookingRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository,
                               UserRepository userRepository,
                               BookingRepository bookingRepository) {
        this.customerRepository = customerRepository;
        this.userRepository = userRepository;
        this.bookingRepository = bookingRepository;
    }
}