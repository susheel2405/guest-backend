package com.neoteric.guest_backend;

import java.util.List;

public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public List<Guest> createGuest(List<Guest> guests) {
        return guestRepository.saveAll(guests);
    }
}
