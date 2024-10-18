package com.ms_reserve.reserve.modelo;

import java.util.List;

public class Reserve {
    private int idReserve;
    private String idFlight;
    private String idPassenger;
    private String dateReserve;
    private String status;
    private List<Passengers> passengers;

    public Reserve(int idReserve, String idFlight, String idPassenger, String dateReserve, String status, List<Passengers> passengers) {
        this.idReserve = idReserve;
        this.idFlight = idFlight;
        this.idPassenger = idPassenger;
        this.dateReserve = dateReserve;
        this.status = status;
        this.passengers = passengers;
    }

    public int getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(int idReserve) {
        this.idReserve = idReserve;
    }

    public String getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(String idFlight) {
        this.idFlight = idFlight;
    }

    public String getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(String idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getDateReserve() {
        return dateReserve;
    }

    public void setDateReserve(String dateReserve) {
        this.dateReserve = dateReserve;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Passengers> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passengers> passengers) {
        this.passengers = passengers;
    }
}
