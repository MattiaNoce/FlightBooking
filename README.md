# FlightBooking
 Exercise Alten

TRACCIA 1

Il compito consiste nell'implementare un sistema di prenotazione di voli.
Il sistema dovrà essere in grado di gestire la prenotazione di voli tra due aeroporti, tenendo traccia dei seguenti dati per ogni prenotazione:

•	Data del volo

•	Orario di partenza e arrivo

•	Aeroporto di partenza e arrivo

•	Numero di posti prenotati

•	Nome del passeggero che ha effettuato la prenotazione

Dovrai implementare una classe FlightBookingSystem che consenta di gestire le prenotazioni. In particolare, la classe dovrà avere i seguenti metodi:

•	bookFlight(flightNumber: String, date: Date, passengerName: String, numSeats: int): boolean - questo metodo dovrebbe consentire di prenotare un volo con il numero di volo flightNumber, in una data specificata date, per un passeggero con il nome passengerName, prenotando un certo numero di posti numSeats. Il metodo dovrebbe restituire true se la prenotazione è andata a buon fine, false altrimenti.

•	getFlightBookings(flightNumber: String, date: Date): List<Booking> - questo metodo dovrebbe restituire una lista di tutte le prenotazioni per un volo con il numero di volo flightNumber e la data date.

•	getAvailableSeats(flightNumber: String, date: Date): int - questo metodo dovrebbe restituire il numero di posti disponibili per un volo con il numero di volo flightNumber e la data date.

•	getFlights(fromAirport: String, toAirport: String, date: Date): List<Flight> - questo metodo dovrebbe restituire una lista di tutti i voli disponibili per un determinato itinerario, partendo dall'aeroporto di partenza fromAirport e arrivando all'aeroporto di arrivo toAirport in una data specificata date.

•	getPassengerBookings(passengerName: String): List<Booking> - questo metodo dovrebbe restituire una lista di tutte le prenotazioni effettuate da un passeggero con il nome passengerName.

•	cancelBooking(bookingId: String): boolean - questo metodo dovrebbe consentire di annullare una prenotazione con l'ID bookingId. Il metodo dovrebbe restituire true se l'annullamento è andato a buon fine, false altrimenti.

Note

•	Si può assumere che ci sia già un sistema per la gestione dei voli (cioè, non è necessario implementare la classe Flight).

•	Si può assumere che ci sia un modo per generare ID univoci per le prenotazioni.

•	Si può utilizzare una qualsiasi struttura dati per memorizzare le prenotazioni (ad esempio, una lista o una mappa).

•	Si possono utilizzare librerie esterne come java.util.Date o java.time.LocalDateTime per rappresentare le date e gli orari.

