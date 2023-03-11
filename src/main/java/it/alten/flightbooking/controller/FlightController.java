package it.alten.flightbooking.controller;

import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.FlightDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/flights")
public interface FlightController {
    @PostMapping()
    ResponseEntity<Flight> save(@RequestBody FlightDto flightDto);

    @GetMapping("/{id}")
    ResponseEntity<Flight> findById(@PathVariable("id") Long id);

    @GetMapping()
    ResponseEntity<List<Flight>> findAll();

    @GetMapping("/{findByFlightNumber}")
    ResponseEntity<Flight> findByFlightNumber(@PathVariable("flightNumber") String flightNumber);

    @PutMapping("/updateFlight/{id}")
    ResponseEntity<Flight> updateUser(@PathVariable(value = "id") Long id, @RequestBody FlightDto flightDto);

    @PutMapping("/updateFlightByNumber/{flightNumber}")
    ResponseEntity<Flight> updateUser(@PathVariable(value = "flightNumber") String flightNumber, @RequestBody FlightDto flightDto);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Flight> deleteFlight(Long id);
    @DeleteMapping("/delete")
    ResponseEntity<List<Flight>> deleteAll();
}
