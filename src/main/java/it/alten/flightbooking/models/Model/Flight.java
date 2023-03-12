package it.alten.flightbooking.models.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="flight")

public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromAirport;

    private String toAirport;


    private String departureTime;

    private String landingTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private int seats;
    private String flightNumber;

}
