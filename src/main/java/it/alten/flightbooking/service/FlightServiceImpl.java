package it.alten.flightbooking.service;

import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.FlightDto;
import it.alten.flightbooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightRepository repo;


    @Override
    public Flight save(Flight flight) {


        return repo.save(flight);
    }

    @Override
    public Flight update(Long id, FlightDto flightDto) {
        //TODO
        return null;
    }

    @Override
    public Flight deleteById(Long id) {
        //TODO
        return null;
    }

    @Override
    public List<Flight> deleteAll() {
        //TODO
        return null;
    }

    @Override
    public Flight findById(Long id) {
        //TODO
        return null;
    }

    @Override
    public List<Flight> findAll() {
        //TODO
        return null;
    }
}
