package InterFaces;

import osnova.Booking;

import java.util.List;

public interface BookingInterface {
    void bookAnnouncement ( List<Booking> bookings);
    void unBookAnnouncement ( List<Booking> bookings);
}
