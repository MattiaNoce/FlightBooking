package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Booking;
import it.alten.flightbooking.models.dto.BookingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bookings")
public interface FlightBookingController {
    @PostMapping()
    ResponseEntity<Booking> save(@RequestBody BookingDto bookingDto);

    @GetMapping("/{id}")
    ResponseEntity<Booking> findById(@PathVariable("id") Long id);

    @GetMapping()
    ResponseEntity<List<Booking>> findAll();
}
