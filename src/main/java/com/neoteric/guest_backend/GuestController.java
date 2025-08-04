package com.neoteric.guest_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @PostMapping("/guests")
    public ResponseEntity<List<Guest>> addGuests(@RequestBody List<Guest> guests) {
        List<Guest> savedGuests = guestRepository.saveAll(guests);
        return ResponseEntity.ok(savedGuests);
    }

    @GetMapping("/get/guests")
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }

    @DeleteMapping("/guests/{id}")
    public void deleteGuest(@PathVariable Long id) {
        guestRepository.deleteById(id);
    }
}

