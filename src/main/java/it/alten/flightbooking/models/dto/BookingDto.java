package it.alten.flightbooking.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    private LocalDate flightDate;

    private String flightNumber;

    private LocalDateTime depatureTime;

    private LocalDateTime arrivalTime;

    private String landingAirport;

    private String takeOffAirport;

    private Integer numSeats;

    private String passengerName;
}
