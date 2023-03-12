package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.FlightDto;
import it.alten.flightbooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/flights")
@RestController
public class FlightControllerImpl implements FlightController {
    private FlightService flightService;

    @Autowired
    public FlightControllerImpl(FlightService flightService) {
        this.flightService = flightService;
    }

    @Override
    @PostMapping()
    public ResponseEntity<Flight> save(@RequestBody Flight flight) {
        Flight savedFlight = flightService.save(flight);
        return new ResponseEntity<>(savedFlight, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Flight> findById(Long id) {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<List<Flight>> findAll() {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<Flight> findByFlightNumber(String flightNumber) {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<Flight> updateUser(Long id, FlightDto flightDto) {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<Flight> updateUser(String flightNumber, FlightDto flightDto) {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<Flight> deleteFlight(Long id) {
        //TODO
        return null;
    }

    @Override
    public ResponseEntity<List<Flight>> deleteAll() {
        //TODO
        return null;
    }
}
