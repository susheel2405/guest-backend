package com.neoteric.guest_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
@CrossOrigin(origins = "http://localhost:3000")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;




    @GetMapping("/all")
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }


    @PostMapping("/add")
    public List<Guest> addGuests(@RequestBody List<Guest> guests) {
        return guestRepository.saveAll(guests); // ✅ appends to DB
    }



}

