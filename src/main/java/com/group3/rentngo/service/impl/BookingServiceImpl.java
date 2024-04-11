package com.group3.rentngo.service.impl;

import com.group3.rentngo.repository.BookingRepository;
import com.group3.rentngo.repository.CarRepository;
import com.group3.rentngo.repository.CustomerRepository;
import com.group3.rentngo.repository.FeedbackRepository;
import com.group3.rentngo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final CustomerRepository customerRepository;
    private final CarRepository carRepository;
    private final FeedbackRepository feedbackRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository,
                              CustomerRepository customerRepository,
                              CarRepository carRepository,
                              FeedbackRepository feedbackRepository) {
        this.bookingRepository = bookingRepository;
        this.customerRepository = customerRepository;
        this.carRepository = carRepository;
        this.feedbackRepository = feedbackRepository;
    }

    /**
     * @author thiendd
     * @description
     */
    @Override
    public void changeBookingStatus(int id) {
        bookingRepository.updateById(id);
    }
}
