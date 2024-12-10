package com.HiricaFlaviusStefan.RBS.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Table table;

    private LocalDateTime reservationDateTime;

    private String status; // CONFIRMED, PENDING, CANCELLED

    // Constructori
    public Reservation() {}

    public Reservation(Customer customer, Table table, LocalDateTime reservationDateTime, String status) {
        this.customer = customer;
        this.table = table;
        this.reservationDateTime = reservationDateTime;
        this.status = status;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", customer=" + customer +
                ", table=" + table +
                ", reservationDateTime=" + reservationDateTime +
                ", status='" + status + '\'' +
                '}';
    }
}