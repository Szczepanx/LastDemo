package com.example.lastdemo.place;

import com.example.lastdemo.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Place {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String adres;
    private int numberOfRooms;

    @OneToMany
    private Set<User> users;


    public Place(String city, String adres, int numberOfRooms) {
        this.city = city;
        this.adres = adres;
        this.numberOfRooms = numberOfRooms;
    }

    public Place(Long id, String city, String adres, int numberOfRooms) {
        this.id = id;
        this.city = city;
        this.adres = adres;
        this.numberOfRooms = numberOfRooms;
    }

    public Place() {
    }

    public Long getId() {
        return id;
    }

    public Place setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Place setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAdres() {
        return adres;
    }

    public Place setAdres(String adres) {
        this.adres = adres;
        return this;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public Place setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }


    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", adres='" + adres + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }

}
