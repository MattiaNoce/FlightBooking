package it.alten.flightbooking.repository;

import it.alten.flightbooking.models.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    Optional<Booking> findById(Long id);

    List<Booking> findAll();

    List<Booking> findAllByFlightDate(Date flightDate);

    void deleteBookingById(Long id);

    List<Booking> findByPassengerName(String passengerName);

    List<Booking> findBookingsByFlightNumberAndFlightDate(String flightNumber, Date flightDate);
    Optional<Booking> findByFlightNumber(String flightNumber);

}
