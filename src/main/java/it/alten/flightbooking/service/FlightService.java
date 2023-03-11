package it.alten.flightbooking.service;

import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.FlightDto;

import java.util.List;

public interface FlightService {
    Flight save(FlightDto flightDto);
    Flight update(Long id,FlightDto flightDto);
    Flight deleteById(Long id);
    List<Flight> deleteAll();
    Flight findById(Long id);

    List<Flight> findAll();
}
