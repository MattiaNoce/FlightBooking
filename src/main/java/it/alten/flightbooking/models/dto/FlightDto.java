package it.alten.flightbooking.models.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FlightDto {
    private Long id;

    private String fromAirport;

    private String toAirport;


    private String departureTime;

    private String landingTime;

    private Date date;

    private int seats;
    private String flightNumber;

}
