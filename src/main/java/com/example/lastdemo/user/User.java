package com.example.lastdemo.user;



import com.example.lastdemo.dates.Dates;
import com.example.lastdemo.place.Place;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private int pesel;

    private int nip;

    private String city;

    private String street;

    private String postCode;

    private String adresNumber;

    private int numberOfPersons;

    private int phoneNumber;

    private String email;

    @OneToOne
    @JoinColumn(name = "date_id")
    private Dates dates;

    @ManyToOne
    @JoinColumn(name="place_id")
    private Place place;

    public User(String firstName, String lastName, int pesel, int nip, String city, String street, String postCode, String adresNumber, int numberOfPersons, int phoneNumber, String email, Dates dates, Place place) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.nip = nip;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.adresNumber = adresNumber;
        this.numberOfPersons = numberOfPersons;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dates = dates;
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public User setPlace(Place place) {
        this.place = place;
        return this;
    }

    public Dates getDates() {
        return dates;
    }

    public User setDates(Dates dates) {
        this.dates = dates;
        return this;
    }

    public User(Long id, String firstName, String lastName, int pesel, int nip, String city, String street, String postCode, String adresNumber, int numberOfPersons, int phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.nip = nip;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.adresNumber = adresNumber;
        this.numberOfPersons = numberOfPersons;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User(String firstName, String lastName, int pesel, int nip, String city, String street, String postCode, String adresNumber, int numberOfPersons, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.nip = nip;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.adresNumber = adresNumber;
        this.numberOfPersons = numberOfPersons;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public User setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getPesel() {
        return pesel;
    }

    public User setPesel(int pesel) {
        this.pesel = pesel;
        return this;
    }

    public int getNip() {
        return nip;
    }

    public User setNip(int nip) {
        this.nip = nip;
        return this;
    }

    public String getCity() {
        return city;
    }

    public User setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public User setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public User setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public String getAdresNumber() {
        return adresNumber;
    }

    public User setAdresNumber(String adresNumber) {
        this.adresNumber = adresNumber;
        return this;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public User setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
        return this;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", nip=" + nip +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                ", adresNumber='" + adresNumber + '\'' +
                ", numberOfPersons=" + numberOfPersons +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }


}
