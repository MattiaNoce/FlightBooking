package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Booking;
import it.alten.flightbooking.models.dto.BookingDto;
import it.alten.flightbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}")
    public ResponseEntity<Booking> findById(Long id) {
        Booking bookingFind = bookingService.findById(id);
        return new ResponseEntity<>(bookingFind, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Booking>> findAll() {
        //TODO
        return null;
    }

    @Override
    @GetMapping("/findByFlight/{flightNumber}")
    public ResponseEntity<Booking> findByFlightNumber(String flightNumber ) {
        Booking bookingFind = bookingService.findByFlightNumber(flightNumber);
        return new ResponseEntity<>(bookingFind, HttpStatus.FOUND);
    }

}
