package it.alten.flightbooking.service;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import it.alten.flightbooking.models.Model.Booking;
import it.alten.flightbooking.models.Model.Flight;
import it.alten.flightbooking.models.dto.BookingDto;
import it.alten.flightbooking.repository.BookingRepository;
import it.alten.flightbooking.repository.FlightRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FlightBookingSystem implements BookingService{

    @Autowired
    BookingRepository repo;

    FlightRepository flightRepo = new FlightRepository();


    @Override
    public boolean bookFlight(String flightNumber, Date flightDate, String passengerName, int numSeats) {
        if(!repo.findBookingsByFlightNumberAndFlightDate(flightNumber,flightDate).isEmpty()  &&
                !repo.findByPassengerName(passengerName).isEmpty()   &&
                flightRepo.findByFlightNumber(flightNumber).getSeats()>=numSeats){
            return true;
        }
        return false;
    }

    @Override
    public List<Booking> getFlightBookings(String flightNumber, Date flightDate) {
        return repo.findBookingsByFlightNumberAndFlightDate(flightNumber,flightDate);
    }

    public int getAvailableSeats(String flightNumber, Date flightDate){
        return flightRepo.findByFlightNumberAndFlightDate(flightNumber,flightDate).getSeats();
    }

    public List<Flight> getFlights(String fromAirport, String toAirport, Date date){
        return flightRepo.findByFromAirportAndToAirportAndDate(fromAirport,toAirport,date);
    }

    @Override
    public List<Booking> getPassengerBookings(String passengerName) {
        return repo.findByPassengerName(passengerName);
    }

    @Override
    public boolean cancelBooking(Long id) {
        if(repo.findById(id).isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public Booking save(BookingDto bookingDto) {
        ModelMapper modelMapper = new ModelMapper();
        return repo.save(modelMapper.map(bookingDto, Booking.class));

    }

    @Override
    public Booking findById(Long id) {
        return repo.findById(id).orElseThrow(ResourceNotFoundException::new);}
}