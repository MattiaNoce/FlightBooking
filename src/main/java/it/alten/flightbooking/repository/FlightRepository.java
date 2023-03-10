package it.alten.flightbooking.repository;

import it.alten.flightbooking.models.Model.Flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightRepository {

    private List<Flight> flights = new ArrayList<>();
    public FlightRepository(){
        Date date = new Date();
        flights.add(
                new Flight(1l,"FCO","BCN","10:30:00","12:30:00",date,200,"AAAA")
        );
        flights.add(
                new Flight(2l,"FCO","FEW","18:30:00","20:30:00",date,200,"BBBB")
        );
        flights.add(
                new Flight(3l,"LSR","JND","22:30:00","20:30:00",date,200,"CCCC")
        );
        flights.add(
                new Flight(4l,"CMP","FCO","09:30:00","10:30:00",date,200,"DDDD")
        );
    }

    public Flight findByFlightNumber(String flightNumber){
        for (Flight f:
                flights) {
            if (f.getFlightNumber().equals(flightNumber)){
                return f;
            }
        }
        return null;
    }

    public Flight findByFlightNumberAndFlightDate(String flightNumber, Date flightDate) {
        for (Flight f:
                flights) {
            if(f.getFlightNumber().equals(flightNumber) && f.getDate()==flightDate){
                return f;
            }
        }
        return null;
    }

    public List<Flight> findByFromAirportAndToAirportAndDate(String fromAirport, String toAirport, Date date) {
        List<Flight> found = new ArrayList<>();
        for (Flight f:
                flights) {
            if(f.getFromAirport().equals(fromAirport) && f.getToAirport().equals(toAirport) && f.getDate()==date){
                found.add(f);
            }
        }
        return found;
    }
}