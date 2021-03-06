package com.capgemini.controller;

import com.capgemini.Model.Guests.Guest;
import com.capgemini.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
// het is een referentie naar een stukje code in dit geval de restcontroller
public class GuestController {

    @Autowired
    GuestRepository guestRepository;

    @RequestMapping(value = "/api/guests", method = RequestMethod.GET)
    public Iterable <Guest> getGuestList() throws SQLException {
        return guestRepository.findAll();
    }

    @RequestMapping(value = "/api/guest/{guestID}", method = RequestMethod.GET)
    public Guest getGuest(@PathVariable int guestID) throws SQLException {
        return guestRepository.findOne(guestID);
    }

    @RequestMapping(value = "/api/guests", method = RequestMethod.POST)
    public Guest addGuestList(@RequestBody Guest guest) throws SQLException {
        return guestRepository.save(guest);
    }

    @RequestMapping(value = "/api/guests/{GuestID}", method = RequestMethod.DELETE)
    public void removeGuest(@PathVariable int GuestID) throws SQLException {
        guestRepository.delete(GuestID);
    }

    @RequestMapping(value = "/api/guests/{GuestID}", method = RequestMethod.PUT)
    public Guest editGuest(@RequestBody Guest guest) throws SQLException {
        return guestRepository.save(guest);
    }

}