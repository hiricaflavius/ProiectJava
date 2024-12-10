package com.HiricaFlaviusStefan.RBS.model;

import jakarta.persistence.*;

@Entity
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int seats;

    private String location;

    // Constructori
    public Table() {}

    public Table(int seats, String location) {
        this.seats = seats;
        this.location = location;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", seats=" + seats +
                ", location='" + location + '\'' +
                '}';
    }
}