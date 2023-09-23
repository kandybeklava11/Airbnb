package InterFaces;

import osnova.Address;
import osnova.Booking;

import java.util.List;

public interface UserInterface {
    void getAllUser(List<Booking> bookings);

    void getAnnouncementsByUserId(List<Booking> bookings);

    void getAnnouncementsByAddress(List<Booking> bookings);
}
