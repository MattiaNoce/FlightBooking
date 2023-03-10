package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Booking;
import it.alten.flightbooking.models.dto.BookingDto;
import it.alten.flightbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/bookings")
@RestController
public class FlightBookingControllerImpl implements FlightBookingController{
    private BookingService bookingService;
    @Autowired
    public  FlightBookingControllerImpl(BookingService bookingService){this.bookingService=bookingService;}
    @Override
    @PostMapping()
    public ResponseEntity<Booking> save(@RequestBody  BookingDto bookingDto) {
        Booking bookingSaved=bookingService.save(bookingDto);
        return new ResponseEntity<>(bookingSaved, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Optional<Booking>> findById(Long id) {

        //TODO
        return null;
    }

    @Override
    public ResponseEntity<List<Booking>> findAll() {

        //TODO
        return null;
    }
}
