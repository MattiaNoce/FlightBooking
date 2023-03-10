package it.alten.flightbooking.service;

import it.alten.flightbooking.models.Model.Booking;
import it.alten.flightbooking.models.dto.BookingDto;

import java.util.Date;
import java.util.List;

public interface BookingService {

    boolean bookFlight(String flightNumber, Date flightDate, String passengerName, int numSeats);

    List<Booking> getFlightBookings(String flightNumber, Date flightDate);

    List<Booking> getPassengerBookings(String passengerName);

    boolean cancelBooking(Long id);

    Booking save(BookingDto bookingDto);

    Booking findById(Long id);

    Booking findByFlightNumber(String flightNumber);
}
