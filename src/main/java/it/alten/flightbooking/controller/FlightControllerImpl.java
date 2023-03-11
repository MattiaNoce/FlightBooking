package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.FlightDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FlightControllerImpl implements  FlightController{

    @Override
    public ResponseEntity<Flight> save(FlightDto flightDto) {
        //TODO
        return null;
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
