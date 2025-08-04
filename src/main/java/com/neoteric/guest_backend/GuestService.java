package com.neoteric.guest_backend;

import java.util.List;

public interface GuestService {

    List<Guest> getAllGuests();

    List<Guest> createGuest(List<Guest> guests);
}
